package com.org.app.myfirstrestapi.service;

import java.util.List;

import com.org.app.myfirstrestapi.vo.Customer;

public interface CustomerManager {
    public List<String> getNames() throws Exception;
    
    public void persitCustomer(Customer cust);

    public List<Customer> fetchAllCustomer();
}
