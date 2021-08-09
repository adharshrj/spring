package com.assessment.javaconfig.config;
import com.assessment.javaconfig.model.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean(name="countryObj")
 public Country getCountry()
 {
  return new Country("India");
 }
}
