package com.assessment.qualifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class QualifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualifierApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		UserProfile profile = (UserProfile) context.getBean("profile");
		profile.fetchAge();
		profile.fetchName();
		profile.fetchPhone();

		UserProfile2 profile2 = (UserProfile2) context.getBean("profile2");
		profile2.fetchAge();
		profile2.fetchName();
		profile2.fetchPhone();
	}

}
