package com.exam.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	

	// Creat User API
	@PostMapping("/") 
	public User createUser(@RequestBody User user) throws Exception{

		Role role = new Role();

		role.setId(40L);
		role.setRoleName("NORMAL");

		UserRole userRole = new UserRole();
		userRole.setRole(role);
		userRole.setUser(user);

		Set<UserRole> userRoleSet = new HashSet<>();

		userRoleSet.add(userRole);

		return this.userService.createUser(user, userRoleSet);

	}
	
	//Get User
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") String userName) {
		
		return this.userService.getUserByUserName(userName);
	}
}
