package com.assessment.qualifier;
public class User {
    private Integer age;
    private String name;
    private String phone;

    public String getName() {
        return name;
    }
     
    public void setName(String name) {
        this.name = name;
    }

    
    public Integer getAge() {
       return age;
    }
   
    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
 
 }