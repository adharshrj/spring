package com.spring.restapi.model;

public class EmployeePhoneJoin {
    public EmployeePhoneJoin(int id, String name, String pNumber) {
        this.id = id;
        this.name = name;
        this.pNumber = pNumber;
    }

    private int id;

    private String name;

    private String pNumber;
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpNumber() {
        return pNumber;
    }

    public void setpNumber(String pNumber) {
        this.pNumber = pNumber;
    }

    @Override
    public String toString() {
        return "EmployeePhoneJoin [id=" + id + ", name=" + name + ", pNumber=" + pNumber + "]";
    }
    
}