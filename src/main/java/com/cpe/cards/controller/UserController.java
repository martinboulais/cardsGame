package com.cpe.cards.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cpe.cards.model.User;

@RestController
public class UserController {
	
	// On délègue à Spring la gestion de cet attribut, notament sa construction ainsi que la gestion de
	// ses propres injections
	@Autowired
	private UserService userService;
	
	
	// L'anotation @RequestMapping permet d'indiquer quelle url devra être demandée pour que l'on éxécute
	// cette méthode
	@RequestMapping("/users")
	private List<User> getAllCourses() {
		return userService.getAllUsers();
	}
}