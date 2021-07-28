package com.spring.restapi.config;
import java.util.Date;

import com.spring.restapi.model.SomeBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

// <bean id="somename" class=a.b.c.d.Mybean"/>
    @Bean
    public SomeBean someMethod(){
        SomeBean be = new SomeBean();
        be.setMessage("Some Bean" + new Date());
        return be;
    }
}