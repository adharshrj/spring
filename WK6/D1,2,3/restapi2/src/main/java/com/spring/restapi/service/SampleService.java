package com.spring.restapi.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

	
	public String caller(Integer id) throws RuntimeException {
		return doSomeFunctionlLogic(2);
	}
	
	private String doSomeFunctionlLogic(Integer number) {
		//doing some funational logic
		if(number.equals(5)) {
			throw new RuntimeException();
		}
		return "";
	}
	
}
