package com.spring.autowire.ByType;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ByType {

	public static void main(String[] args) {
		ApplicationContext context = 
		    	  new ClassPathXmlApplicationContext("com/spring/autowire/ByType/byType.xml");
		 
		    	Employee employee = (Employee)context.getBean("employee");
		    	System.out.println(employee.getFullName());
		    	System.out.println(employee.getDepartment().getName());
	}
}