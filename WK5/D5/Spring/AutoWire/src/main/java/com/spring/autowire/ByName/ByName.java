package com.spring.autowire.ByName;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByName {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/autowire/ByName/byName.xml");

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee.getFullName());
		System.out.println(employee.getDepartment().getName());

	}
}
