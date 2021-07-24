package com.spring.restget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restget.exception.ServerException;
import com.spring.restget.exception.RecordNotFoundException;
import com.spring.restget.model.User;
import com.spring.restget.service.UserService;
import com.spring.restget.intf.UserIntf;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("get/users")
	public ResponseEntity<List<User>> getAll() {
		return new ResponseEntity<>(userService.getAll(), HttpStatus.OK);
	}

	@GetMapping(value="get/users/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getById(@PathVariable final long id) {
		Optional<User> user = userService.getById(id);
		if (user.isPresent()) {
			return new ResponseEntity<>(user.get(), HttpStatus.OK);
		}
		else {
			throw new RecordNotFoundException();
		}
	}

	@GetMapping("/users/all")
	public ResponseEntity<Collection<Customer>> getAllCustomers(){
		return new ResponseEntity<Collection<Customer>>(customers.getAll(), HttpStatus.OK);
	}

	@PostMapping(value = "post/users",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> create(@RequestBody final User newUser) {
		User user = userService.save(newUser);
		if (user == null) {
			throw new ServerException();
		}
		else {
			return new ResponseEntity<>(user, HttpStatus.CREATED);
		}
	}

	@PutMapping(value = "put/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> update(@RequestBody final User updatedUser) {
		User user = userService.save(updatedUser);
		if (user == null) {
			throw new ServerException();
		}
		else {
			return new ResponseEntity<>(user, HttpStatus.OK);
		}
	}
}