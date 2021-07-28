package com.spring.restapi.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*; 
import com.spring.restapi.model.Customer;
import com.spring.restapi.storage.CustomerStorage;
import com.spring.restapi.error.*;
import com.spring.restapi.repo.CustomerRepo;
@RestController
@RequestMapping("/api")
public class GetController {

	@Autowired
	CustomerStorage customers;
	
	
	
	@GetMapping("/string")
	public String getString() {
		return "REST API";
	}
	
	
	@GetMapping("/customer/{id}")
	public ResponseEntity<?> getCustomer(@PathVariable int id) throws ErrorCust{
	try{	
		//if(customers.exists(id)) {
			return new ResponseEntity<Customer>(customers.get(id), HttpStatus.OK);	
		//} else {
			
		//}
	}catch(ErrorCust ec){
		//return new ResponseEntity<String>("Not found a customer with id = " + id, HttpStatus.NOT_FOUND);
		//throw new NotFoundException();
		throw ec;
	}
	}
	
	@GetMapping("/customer/all")
	public ResponseEntity<Collection<Customer>> getAllCustomers() throws ErrorCust{
	try{	
		return new ResponseEntity<Collection<Customer>>(customers.getAll(), HttpStatus.OK);
	}catch(ErrorCust ec){
		throw ec;
		}
	}
	

	
}