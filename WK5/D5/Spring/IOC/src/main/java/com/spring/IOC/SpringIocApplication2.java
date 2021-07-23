package com.spring.IOC;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class SpringIocApplication2 {

	public static void main(String[] args) {
		System.out.println("Exam Details");
		ApplicationContext ac = new ClassPathXmlApplicationContext("exam.xml");
		
		Exam e1 = (Exam)ac.getBean("ex1");
		System.out.println(e1);
		
		Exam e2 = (Exam)ac.getBean("ex2");
		System.out.println(e2);
		
		Exam e3 = (Exam)ac.getBean("ex3");
		System.out.println(e3);
		
		Exam e4 = (Exam)ac.getBean("ex4");
		System.out.println(e4);
	}

}
