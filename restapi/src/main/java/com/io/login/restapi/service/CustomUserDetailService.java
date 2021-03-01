package com.io.login.restapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.io.login.restapi.entity.User;
import com.io.login.restapi.repository.UserRepository;
@Service
public class CustomUserDetailService implements UserDetailsService{
	
	Logger logger = LoggerFactory.getLogger(CustomUserDetailService.class);


	@Autowired
	private UserRepository repo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repo.findByUsername(username);
		CustomUserDetails userDetails = null;
		if(user != null) {
			userDetails = new CustomUserDetails();
			userDetails.setUser(user);
		}
		else {
			throw new UsernameNotFoundException("User not exists with the name");
		}
		return userDetails;
	}

}
