package com.spring.autowire.Constructor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Constructor {

	public static void main(String[] args) {
		ApplicationContext context = 
		    	  new ClassPathXmlApplicationContext("com/spring/autowire/Constructor/constructor.xml");
		 
		    	Employee employee = (Employee)context.getBean("employee");
		    	System.out.println(employee.getFullName());
		    	System.out.println(employee.getDepartment().getName());
	}
}