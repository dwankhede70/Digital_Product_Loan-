package com.Project.GroceryApp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.GroceryApp.entity.CartDetails;
import com.Project.GroceryApp.entity.OrderDetails;
@Repository

public interface orderRepository  extends JpaRepository<OrderDetails, Long> {

	
}
