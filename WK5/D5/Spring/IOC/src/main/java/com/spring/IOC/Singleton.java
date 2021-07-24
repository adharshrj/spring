package com.spring.IOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Scope Details");
		ApplicationContext ac = new ClassPathXmlApplicationContext("singleton.xml");
		
		Scope s1 = (Scope)ac.getBean("scope");
		s1.setMessage("I am Singleton Scope Object 1");
		s1.getMessage();
		
		Scope s2 = (Scope)ac.getBean("scope");
		s2.getMessage();
	}

}
