package com.io.login.restapi.controller;
import org.slf4j.LoggerFactory;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.io.login.restapi.entity.AuthenticationRequest;
import com.io.login.restapi.entity.AuthenticationResponse;
import com.io.login.restapi.entity.User;
import com.io.login.restapi.service.UserService;
import com.io.login.restapi.util.JwtUtil;
@RestController
public class UserController {

	@Autowired(required=true)
	private UserService usersService;
	
	@Autowired(required=true)
	private AuthenticationManager authenticationManager;
	
	@Autowired 
	private UserDetailsService userDetailsService;
	@Autowired
	private JwtUtil jwtTokenUtil;
	
	
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
	
	@PostMapping("/authenticate")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception{
	try {
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword()));
			
	}
	catch(BadCredentialsException e){
		throw new Exception("Incorrect username or password",e);
		}
	
	final UserDetails userDetails = userDetailsService
		.loadUserByUsername(authenticationRequest.getUsername());
	final String jwt = jwtTokenUtil.generateToken(userDetails);
	return ResponseEntity.ok(new AuthenticationResponse(jwt));
	
	}
	
}
