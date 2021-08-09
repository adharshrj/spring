package com.assessment.javaconfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.assessment.javaconfig.model.Country;
import com.assessment.javaconfig.config.Config;

@SpringBootApplication
public class JavaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaConfigApplication.class, args);
		@SuppressWarnings("resource")
  		ApplicationContext appContext = new AnnotationConfigApplicationContext(Config.class);
  		Country countryObj = (Country) appContext.getBean("countryObj");
  		String countryName=countryObj.getCountryName();
 
  		System.out.println("Country name: "+ countryName);
	}

}
