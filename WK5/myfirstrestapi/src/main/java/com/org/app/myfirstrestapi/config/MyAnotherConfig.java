package com.org.app.myfirstrestapi.config;

import java.util.Date;

import com.org.app.myfirstrestapi.vo.MyBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyAnotherConfig {
    

// <bean id="somename" class=a.b.c.d.Mybean"/>
    @Bean
    public MyBean someMethod(){
        MyBean mb = new MyBean();
        mb.setMessage("My Data.." + new Date());
        return mb;
    }
}
