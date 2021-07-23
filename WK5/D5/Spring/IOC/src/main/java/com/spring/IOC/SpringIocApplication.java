package com.spring.IOC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringIocApplication {

	public static void main(String[] args) {
		System.out.println("Student Details");
		ApplicationContext ac = new ClassPathXmlApplicationContext("stud.xml");
		
		Student s1 = (Student)ac.getBean("stud1");
		System.out.println(s1);
		
		Student s2 = (Student)ac.getBean("stud2");
		System.out.println(s2);
		
	}

}
