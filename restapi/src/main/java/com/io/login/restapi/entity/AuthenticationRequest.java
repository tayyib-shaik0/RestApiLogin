package com.io.login.restapi.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthenticationRequest {
	
	Logger logger = LoggerFactory.getLogger(AuthenticationRequest.class);

	private String username;
	private String password;
	
	
	
	public AuthenticationRequest() {
	
	}
	
	
	public AuthenticationRequest(String username, String password) {
		this.username = username;
		this.password = password;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
