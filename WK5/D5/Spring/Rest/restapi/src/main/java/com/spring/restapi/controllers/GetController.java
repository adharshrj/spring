package com.spring.restapi.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*; 
import com.spring.restapi.model.Customer;
import com.spring.restapi.storage.CustomerStorage;

@RestController
@RequestMapping("/api/get")
public class GetController {

	@Autowired
	CustomerStorage customers;
	
	@GetMapping("/string")
	public String getString() {
		return "REST API";
	}
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<?> getCustomer(@PathVariable int id) {
		if(customers.exists(id)) {
			return new ResponseEntity<Customer>(customers.get(id), HttpStatus.OK);	
		} else {
			return new ResponseEntity<String>("Not found a customer with id = " + id, HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/customer/all")
	public ResponseEntity<Collection<Customer>> getAllCustomers(){
		return new ResponseEntity<Collection<Customer>>(customers.getAll(), HttpStatus.OK);
	}
}