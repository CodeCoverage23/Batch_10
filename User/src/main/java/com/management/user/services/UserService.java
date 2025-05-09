package com.management.user.services;

import java.util.List;

import com.management.user.entity.User;

public interface UserService {

	// save data into db
	User saveUser(User user);
	
	
	// get all user from db
	
	List<User> getAllUser();
	
	
	
	// get user by id from db
	
	User getUserById(String UserId);
	
	
	
	
	
	
	
}
