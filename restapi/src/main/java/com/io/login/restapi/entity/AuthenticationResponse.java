package com.io.login.restapi.entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthenticationResponse {
	Logger logger = LoggerFactory.getLogger(AuthenticationResponse.class);

	private final String jwt;

	public String getJwt() {
		return jwt;
	}

	public AuthenticationResponse(String jwt) {
		this.jwt = jwt;
	}

}
