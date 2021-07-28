package com.spring.restapi.controllers;
import org.springframework.boot.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*; 
import com.spring.restapi.model.Customer;
import com.spring.restapi.storage.CustomerStorage;
import com.spring.restapi.error.*;


@RestController
@RequestMapping("/api")
public class PutController {

	@Autowired
	CustomerStorage customers;
	
	@PutMapping("/customer/{id}")
	public ResponseEntity<String> putCustomer(@PathVariable int id, @RequestBody Customer customer) throws ErrorCust {
		
		if(customers.exists(id)) {
			Customer _customer = customers.get(id);
			
			_customer.setName(customer.getName());
			_customer.setSalary(customer.getSalary());
			_customer.setBirthday(customer.getBirthday());
			
			customers.add(_customer);
			
			return new ResponseEntity<String>("Update Successfully!", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Not found customer with id = " + id, HttpStatus.NOT_FOUND);
		}
	}
}