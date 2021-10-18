package com.Project.GroceryApp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Project.GroceryApp.entity.ProductDetails;

@Repository
public interface productRepository  extends JpaRepository<ProductDetails, Long> {

}
