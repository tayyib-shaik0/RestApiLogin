package com.io.login.restapi.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.io.login.restapi.entity.User;
import com.io.login.restapi.repository.UserRepository;



@Service("userService")
public class UserService {

	@Autowired(required=true)
	private UserRepository usersRepo;
	
	public User saveUser(User user) {
		return usersRepo.save(user);
		
	}
	
	public List<User> getUsers(){
		return usersRepo.findAll();
	}
	
	public User getUserById(int id) {
		return usersRepo.findById(id).orElse(null);
	}

	public void deleteUserById(int id) {
		usersRepo.deleteById(id);
	}
	
	public User updateProductById(User user) {
		User existingUser = usersRepo.findById(user.getId()).orElse(null);
		existingUser.setFirstname(user.getFirstname());
		existingUser.setAddress(user.getAddress());
		existingUser.setPhone(user.getPhone());
		existingUser.setGender(user.getGender());
		existingUser.setBirthday(user.getBirthday());
		existingUser.setPreacher(user.getPreacher());
		existingUser.setAddress(user.getAddress());
		existingUser.setCountryCode(user.getCountryCode());
		existingUser.setAvatar(user.getAvatar());
		existingUser.setChruchname(user.getChruchname());
		existingUser.setPastorname(user.getPastorname());
		existingUser.setLatitude(user.getLatitude());
		existingUser.setLongitude(user.getLongitude());
		existingUser.setEmail(user.getEmail());
		existingUser.setPassword(user.getPassword());
		
		return usersRepo.save(existingUser);
		
	}
 		
	
}
