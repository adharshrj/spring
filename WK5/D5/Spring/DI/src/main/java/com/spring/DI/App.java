package com.spring.DI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("gym.xml");
		InterfaceGym ig = (InterfaceGym)ac.getBean("myGym");
		System.out.println(ig.workout());
		System.out.println(ig.ImpExample());
	}

}
