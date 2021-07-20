package com.springwk5.appwk5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Appwk5Application {

	public static void main(String[] args) {
		//SpringApplication.run(Appwk5Application.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        Payment pay = (Payment)context.getBean("magicpay");
        
        System.out.println(pay);
        
        Payment pay2 = (Payment)context.getBean("magicpay");
        
        System.out.println(pay2);

        System.out.println( "===================Done" );
	}

}
