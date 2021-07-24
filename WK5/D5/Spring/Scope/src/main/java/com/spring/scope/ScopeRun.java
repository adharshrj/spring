package com.spring.scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ScopeRun {

	public static void main(String[] args) {
		System.out.println("Scope Details");
		ApplicationContext ac = new ClassPathXmlApplicationContext("scope.xml");
		
		Scope s1 = (Scope)ac.getBean("scope");
		s1.setMessage("I am Scope Object 1");
		s1.getMessage();
		
		Scope s2 = (Scope)ac.getBean("scope");
		s2.getMessage();
		
		
		
		
	}

}
