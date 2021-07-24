package com.spring.restget;
import com.spring.restget.intf.UserIntf;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class RestgetApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestgetApplication.class, args);
	}

	// @Bean
    // CommandLineRunner initDatabase(UserIntf userIntf) {
    //     return args -> {
    //         userIntf.save(new User("001"));
    //         userIntf.save(new User());
    //         userIntf.save(new User());
    //     };
    // }
}
