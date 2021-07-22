package com.spring.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringDiApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(SpringDiApplication.class, args);
//	}
  private Method m1;
  
  public SpringDiApplication(Method m1) {
	  this.m1 = m1;
  }

}
