package com.Project.GroceryApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.Project.GroceryApp.entity.CartDetails;

@Repository
public interface cartRepository  extends JpaRepository<CartDetails, Long> {




}
