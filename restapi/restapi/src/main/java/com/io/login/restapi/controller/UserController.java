package com.io.login.restapi.controller;
import org.slf4j.LoggerFactory;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.io.login.restapi.entity.User;
import com.io.login.restapi.service.UserService;
@RestController
public class UserController {

	@Autowired(required=true)
	private UserService usersService;
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@PostMapping("/createuser")
	public User createUser(@RequestBody User user) {
		return usersService.saveUser(user);
	}
	
	@GetMapping("/user")
	public List<User> getUsers() {
		return usersService.getUsers();
	}
	
	@GetMapping("/user/{id}")
	public User getUserbyId(@PathVariable int id) {
		return usersService.getUserById(id);
	}
	
	@PutMapping("/updateUser")
	public User updateUser(@RequestBody User user) {
		return usersService.updateProductById(user);
	}
	
	@DeleteMapping("/user/{id}")
	public void deleteProduct(@PathVariable int id) {
		usersService.deleteUserById(id); 
	}

}
