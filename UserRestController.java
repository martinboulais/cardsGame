package com.cpe.springboot.user.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cpe.springboot.user.model.User;

//On précise que cette classe est un controleur rest. Spring va automatiquement garder la liste de ses
//methodes anotées par @RequestMapping ainsi que les URL qu'elles pointent pour les éxécuter si l'url
//demandée correspond
@RestController
public class UserRestController {
	
	// On délègue à Spring la gestion de cet attribut, notament sa construction ainsi que la gestion de
    // ses propres injections
	@Autowired
	private UserService UserService;
	
	// L'anotation @RequestMapping permet d'indiquer quelle url devra être demandée pour que l'on éxécute
    // cette méthode
	@RequestMapping("/test")
	private int test() {
		return 2+4;

	}
	@RequestMapping("/users")
	private List<User> getAllCourses() {
		return UserService.getAllUsers();

	}
	
	//l'annotation est utilisée pour mapper les requêtes Web aux méthodes Spring Controller.
	@RequestMapping("/users/{id}")
	private User getUser(@PathVariable String id) {
		return UserService.getUser(id);

	}
	// On ajoute à @RequestMapping que l'url de la requête doit être /users et on précise qu'elle doit
    // être de type post
	@RequestMapping(method=RequestMethod.POST,value="/users")
	public void addUser(@RequestBody User user) {
		UserService.addUser(user);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/users/{id}")
	public void updateUser(@RequestBody User user,@PathVariable String id) {
		user.setId(Integer.valueOf(id));
		UserService.updateUser(user);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/users/{id}")
	public void deleteUser(@PathVariable String id) {
		UserService.deleteUser(id);
	}
	
	/*@RequestMapping("/users/name/{name}")
	private List<User> getAllCourses(@PathVariable String name) {
		return UserService.getUserByName(name);

	}*/
	@RequestMapping("/users/{id}/{solde}")
	public String Poss(@PathVariable String id, @PathVariable int solde) {
		int valeur=100;
		String retour="NotOk";
		//User user2=UserService.getUser(id);
				if (solde>=valeur) {
					retour="ok";
				}
		return retour; 
	}
	
	@RequestMapping("users/{id}/name")
	public String findUser(@PathVariable String id) {
		String retour="false";
		try {
			User user=UserService.getUser(id); 
			if (!(user.equals(null))) {
				retour="cet utlisateur existe";
			}}catch (Exception e) {
				retour="false";
			}

	}
	

}
