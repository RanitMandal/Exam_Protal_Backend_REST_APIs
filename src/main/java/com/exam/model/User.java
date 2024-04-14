package com.exam.model;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name= "user_Id")
	private Long id;
	private String userName;
	private String password;
	private String fristName;
	private String lastName;
	private String email;
	private String phone;
	private boolean enable = true;
	private String profile;
	
	// User many roles
	@OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.EAGER , mappedBy = "user")
	@JsonIgnore
	private Set<UserRole> userRoles = new HashSet<>();
	
	

	public User(Long id, String userName, String password, String fristName, String lastName, String email,
			String phone, boolean enable, String profile, Set<UserRole> userRoles) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.fristName = fristName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.enable = enable;
		this.profile = profile;
		this.userRoles = userRoles;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	
	
	

}
