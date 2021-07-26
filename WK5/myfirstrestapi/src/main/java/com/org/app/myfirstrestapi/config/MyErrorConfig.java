package com.org.app.myfirstrestapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:errors.properties")
public class MyErrorConfig {
    @Value("${err001}")
    private String err01;


    @Value("${err002}")
    private String err02;


    public String getErr01() {
        return err01;
    }


    public void setErr01(String err01) {
        this.err01 = err01;
    }


    public String getErr02() {
        return err02;
    }


    public void setErr02(String err02) {
        this.err02 = err02;
    }

    
}
