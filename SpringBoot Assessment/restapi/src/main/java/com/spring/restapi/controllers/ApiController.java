package com.spring.restapi.controllers;
import com.spring.restapi.model.*;
import com.spring.restapi.service.*;
import com.spring.restapi.config.Configr;
import com.spring.restapi.error.ErrorCust;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api2")
public class ApiController extends BaseController{
    
    Logger logger = LoggerFactory.getLogger(ApiController.class);

    @Autowired
    private CustomerService service;

    @Autowired
    private PhoneService pservice;

  
    @GetMapping(value = "/customer/all")
	public ResponseEntity<Collection<Customer>> getAllCustomers() throws ErrorCust{
	try{	
		return new ResponseEntity<Collection<Customer>>(service.fetchAllCustomer(), HttpStatus.OK);
	}catch(ErrorCust ec){
		throw ec;
		}
	}
    
    @GetMapping("/customer/{id}")
	public ResponseEntity<Optional<Customer>> getCustomer(@RequestParam("id") int id) throws ErrorCust{
	try{	
			return new ResponseEntity<Optional<Customer>>(service.fetchCustomer(id), HttpStatus.OK);	
	}catch(ErrorCust ec){
		throw ec;
	}
    }

    @PutMapping(value = "/customer/put",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> regiserCustomer(@RequestBody Customer cust){
        logger.debug(cust.toString());
        service.persitCustomer(cust);
        return new ResponseEntity<List<Customer>>(service.fetchAllCustomer(),HttpStatus.OK);
    }

    @PostMapping(value = "/customer/post",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> updateCustomer(@RequestBody Customer cust){
        System.out.println(cust);
        service.persitCustomer(cust);
        return new ResponseEntity<List<Customer>>(service.fetchAllCustomer(),HttpStatus.OK);
    }
    
    @PostMapping(value = "/phone/post",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Phone>> updatePhone(@RequestBody Phone pe){
        System.out.println(pe);
        pservice.persitPhone(pe);
        return new ResponseEntity<List<Phone>>(pservice.fetchAllPhone(),HttpStatus.OK);
    }

    
  
}

