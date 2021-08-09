package com.assessment.javaconfig.model;

public class Country {
 
    private String countryName;
    
    public Country(String countryName) {
    this.countryName=countryName;
    }
    public String getCountryName() {
            return countryName;
    }
    public void setCountryName(String countryName) {
            this.countryName = countryName;
    }
 
}