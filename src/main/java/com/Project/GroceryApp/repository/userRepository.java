package com.Project.GroceryApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.GroceryApp.entity.UserDetails;

@Repository
public interface userRepository extends JpaRepository<UserDetails, Long> {
	
}
