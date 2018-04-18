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
	//
	@RequestMapping("/users/{id}/{solde}")
	public Boolean soldeSuffisant(@PathVariable String id, @PathVariable int solde) {
		User user=UserService.getUser(id); 
		Boolean retour=False;
				if (user.getsolde()>=solde) {
					retour=True;
				}
		return retour; 
	}
	
	@RequestMapping("users/{id}/{id}")
	public Boolean findUser(@PathVariable String id) {
		Boolean retour=False;
		try {
			User user=UserService.getUser(id); 
			if (!(user.equals(null))) {
				retour=True;
			}}catch (Exception e) {
				retour=True;
			}
		return retour;
	}
	@RequestMapping("users/{id}/{boolean}")
	public void MiseAJourSolde(@Pathvariable String id, @Pathvariable String boolean){
		User user=UserService.getUser(id); 
		int NewSolde=user.getsolde();
		int valeur=100; // prix d'une carte pour tester
		if (boolean.equals('1')){ // 1: achat
			solde-=prix;
			user.setsolde(solde);
		}
		else if (boolean.equals('0')){ // O: vente
			solde+=prix;
			user.setsolde(solde);
		}		
			
	}

}
