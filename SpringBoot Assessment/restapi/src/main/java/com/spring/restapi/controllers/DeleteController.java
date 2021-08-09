package com.spring.restapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*; 
import com.spring.restapi.model.Customer;
import com.spring.restapi.storage.CustomerStorage;
import com.spring.restapi.error.ErrorCust;

@RestController
@RequestMapping("/api")
public class DeleteController {

	@Autowired
	CustomerStorage customers;
    
    @DeleteMapping("/customer/{id}")
    public void deleteCustomer(@RequestParam("id")int id) throws ErrorCust {
    try {
        customers.delete(id);
    }catch(ErrorCust nfe){
    	throw nfe;
	    }
    }

}