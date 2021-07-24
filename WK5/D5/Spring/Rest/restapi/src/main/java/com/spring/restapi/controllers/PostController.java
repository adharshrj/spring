package com.spring.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*; 
import com.spring.restapi.model.Customer;
import com.spring.restapi.storage.CustomerStorage;

@RestController
@RequestMapping("/api/post")
public class PostController {

	@Autowired
	CustomerStorage customers;
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> postCustomer(@RequestBody Customer customer) {
		customers.add(customer);
		
	
		customers.getAll().forEach(System.out::println);
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
}