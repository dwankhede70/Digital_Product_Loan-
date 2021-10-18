package com.Project.GroceryApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.GroceryApp.entity.CartDetails;
import com.Project.GroceryApp.entity.OrderDetails;
import com.Project.GroceryApp.entity.ProductDetails;
import com.Project.GroceryApp.entity.UserDetails;
import com.Project.GroceryApp.repository.cartRepository;
import com.Project.GroceryApp.repository.orderRepository;
import com.Project.GroceryApp.repository.productRepository;
import com.Project.GroceryApp.repository.userRepository;

@Service
public class userService {
	@Autowired
	private userRepository  userrepository;

	public OrderDetails saveOrder(OrderDetails orderdetails)
	{
		return orderrepository.save(orderdetails);
	}

	public UserDetails save(UserDetails userdetails)
	{
		return userrepository.save(userdetails);
	}
	public Optional<UserDetails> findUserbyID(Long uid) {
		return userrepository.findById(uid);
	}
	public List<UserDetails> findAllUsers(){
		return userrepository.findAll();
	}

	@Autowired
	private productRepository productrepository;
	public ProductDetails save(ProductDetails productdetails) {
		return productrepository.save(productdetails);
	}
	public Optional <ProductDetails> findProductbyID(Long pid) {
		return productrepository.findById(pid);
	}
	@Autowired
	private orderRepository orderrepository;

	public Optional <OrderDetails> findOrderbyID(Long oid) {
		return orderrepository.findById(oid);
	}
	public List<OrderDetails> findAllOrder() {
		return orderrepository.findAll();
	}
	public UserDetails putUser(UserDetails userdetails) {
		System.out.println(userdetails);
		return userrepository.saveAndFlush(userdetails);
	}
	@Autowired
	private cartRepository cartrepository;

	public CartDetails save(CartDetails cartdetails) {
		return cartrepository.save(cartdetails);
	}
	public List<CartDetails> findAllCart() {
		return cartrepository.findAll();
	}
	public List<ProductDetails> findAllProduct() {
		return productrepository.findAll();
	}
	public void deleteCart(Long id) {
		
		cartrepository.deleteById(id);
	}


}
