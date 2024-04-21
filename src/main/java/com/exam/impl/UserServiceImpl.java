package com.exam.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepo;
import com.exam.repo.UserRepo;
import com.exam.service.UserService;

public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RoleRepo roleRepo;
	
	public User createUser(User user, Set<UserRole> userRoles) {

		User local = this.userRepo.findByUserName(user.getUserName());
		
		if(local != null) {
			
		}
		return null;
	}

}
