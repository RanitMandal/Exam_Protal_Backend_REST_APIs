package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exam.model.Roles;

public interface RoleRepo extends JpaRepository<Roles, Long> {

}
