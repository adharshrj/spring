package com.spring.restget.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


import com.spring.restget.model.User;
import com.spring.restget.intf.UserIntf;

@Service
public class UserService {

	@Autowired
	UserIntf userIntf;

	public List<User> getAll() {
		return userIntf.findAll();
	}

	public Optional<User> getById(long id) {
		return userIntf.findById(id);
	}

	public User save(User newUser) {
		return userIntf.save(newUser);
	}

	public void delete(long id) {
		userIntf.deleteById(id);
	}

}