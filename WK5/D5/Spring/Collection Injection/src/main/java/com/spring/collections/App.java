package com.spring.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     ApplicationContext ac = new ClassPathXmlApplicationContext("collections.xml");
	      Collection c=(Collection)ac.getBean("Collection");
	      
	      c.getL1();
	      c.getS1();
	      c.getM1();
	      c.getP1();
	}

}
