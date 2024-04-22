package com.exam;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exam.model.Roles;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;

@SpringBootApplication
public class ExamProtalApplication implements CommandLineRunner{

	
	@Autowired
	private UserService userService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ExamProtalApplication.class, args);
	}

	public void run(String... args) throws Exception {
		System.out.println("Hi code there");
		
		User user =new User();
		
		user.setEmail("ranitmandal17@gmail.com");
		user.setFristName("Ranit");
		user.setLastName("Mandal");
		user.setUserName("ranitmandal17");
		user.setPassword("123");
		user.setProfile("default.png");
		
		Roles roles = new Roles();
		

		roles.setId(44L);
		roles.setRoleName("ADMIN");
		
		
		
		UserRole userRole =new UserRole();
		userRole.setRole(roles);
		userRole.setUser(user);
		
		Set<UserRole> userRoleSet= new HashSet<>();
		
		userRoleSet.add(userRole);
		
		User creatUser = this.userService.createUser(user, userRoleSet);
		System.out.println(creatUser);
		
	}
}
