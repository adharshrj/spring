package com.springcore.ioc.springioc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringiocApplication {

	// public static void main(String[] args) {
	// 	SpringApplication.run(SpringiocApplication.class, args);
	// }
	String msg;
	public SpringiocApplication(){
		msg="Spring IOC Aspect";
	}
	public SpringiocApplication(String msg1){
		msg=msg1;
	}

	public String getMsg(){
		return msg;
	}
}
