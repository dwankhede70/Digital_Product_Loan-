package com.Project.GroceryApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.GroceryApp.entity.CartDetails;
import com.Project.GroceryApp.entity.OrderDetails;
import com.Project.GroceryApp.entity.ProductDetails;
import com.Project.GroceryApp.entity.UserDetails;
import com.Project.GroceryApp.services.userService;

@RestController
public class userController {
	@Autowired
	private userService userservice;
 
 	@CrossOrigin(origins = "http://localhost:4200")
	
 	@PostMapping("/users")
	public UserDetails saveUser(@RequestBody UserDetails userdetails) {
		System.out.println("Hiii");
		return userservice.save(userdetails);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/user/{uid}")
	public Optional <UserDetails> findUserbyID(@PathVariable("uid") Long uid)
	{
		System.out.println("Hello");
		return userservice.findUserbyID(uid);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@PutMapping("/users/")
	public UserDetails putUser(@RequestBody UserDetails userdetails) {
		System.out.println(userdetails);
		
		return userservice.putUser(userdetails);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/users")
	public  List<UserDetails> findAllUsers(){
		System.out.println("Hello2");
		return userservice.findAllUsers();
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/product")
	public ProductDetails saveProduct(@RequestBody ProductDetails productdetails) {
		return userservice.save(productdetails);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/product/{pid}")
	public Optional <ProductDetails> findProductById(@PathVariable("pid") Long pid){
		return userservice.findProductbyID(pid);
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/product")
	public  List<ProductDetails> findAllProduct(){
		System.out.println("Product");
		return userservice.findAllProduct();
	}
	
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/orders")
	public OrderDetails saveOrder(@RequestBody OrderDetails orderdetails) {
		
		System.out.println("Order");
		return userservice.saveOrder(orderdetails);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/order/{oid}")
	public Optional <OrderDetails> findOrderById(@PathVariable("oid") Long oid){
		return userservice.findOrderbyID(oid);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/orders")
	public  List<OrderDetails> findAllOrder(){
		System.out.println("Hello2");
		return userservice.findAllOrder();
	}

	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/cart")
	public CartDetails save(@RequestBody CartDetails cartdetails) {
		return userservice.save(cartdetails);
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/cart")
	public List<CartDetails> findAllCart() {
		return userservice.findAllCart();
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping("/cart/{id}")
	public void deleteCart(@PathVariable Long id) {
		 userservice.deleteCart(id);
	}
	
	
	
}
