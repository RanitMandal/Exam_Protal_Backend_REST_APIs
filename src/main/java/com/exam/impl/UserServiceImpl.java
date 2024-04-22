package com.exam.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.repo.RoleRepo;
import com.exam.repo.UserRepo;
import com.exam.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private RoleRepo roleRepo;
	
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {

		User local = this.userRepo.findByUserName(user.getUserName());
		
		if(local != null) {
			System.out.println("User is Already there!!");
			throw new Exception("User Allready");
			
		}else {
			//user create 
			for(UserRole ur : userRoles) {
				this.roleRepo.save(ur.getRole());
			}
			
			user.getUserRoles().addAll(userRoles);
			local = this.userRepo.save(user);
			
		}
		return local;
	}

}
