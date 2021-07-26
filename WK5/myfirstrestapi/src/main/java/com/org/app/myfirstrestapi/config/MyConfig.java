package com.org.app.myfirstrestapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Value("${ec2.url}")
    private String ec2Url;

    @Value("${ec2.username}")
    private String ec2Uname;

    @Value("${ec2.password}")
    private String ec2Pwd;

    public String getEc2Url() {
        return ec2Url;
    }

    public void setEc2Url(String ec2Url) {
        this.ec2Url = ec2Url;
    }

    public String getEc2Uname() {
        return ec2Uname;
    }

    public void setEc2Uname(String ec2Uname) {
        this.ec2Uname = ec2Uname;
    }

    public String getEc2Pwd() {
        return ec2Pwd;
    }

    public void setEc2Pwd(String ec2Pwd) {
        this.ec2Pwd = ec2Pwd;
    }

    
}
