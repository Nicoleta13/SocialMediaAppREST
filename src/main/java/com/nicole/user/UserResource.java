package com.nicole.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {
	
	@Autowired
	private UserDAOService service;

	// retrieve all users
	@GetMapping("/users")
	public List<User> retrieveAllUsers(){
		
		return service.findAll();
	}
	
	//retrieve one user(id)
	@GetMapping("/users/{id}")
	public User retrieveUser(@PathVariable int id) {
		return service.findOne(id);
	}
}
