package com.management.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.user.entity.User;
import com.management.user.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	// create user data
	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User user) {

		User saveUser = userService.saveUser(user);

		return new ResponseEntity<User>(saveUser, HttpStatus.CREATED);
	}

	// fetch all user data
	@GetMapping("/all")
	public ResponseEntity<List<User>> fetchAllUserData() {
		List<User> allUser = userService.getAllUser();

		return new ResponseEntity<List<User>>(allUser, HttpStatus.ACCEPTED);
	}

	// fetch user by id
	@GetMapping("/user/{Id}")
	 public ResponseEntity<User> FetchUserById(@PathVariable String Id){
		 User userById = userService.getUserById(Id); 
		 return new ResponseEntity<User>(userById,HttpStatus.OK);
	 }

}
