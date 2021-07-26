package com.org.app.myfirstrestapi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.org.app.myfirstrestapi.exception.IDontLikeException;
import com.org.app.myfirstrestapi.vo.Customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerManagerImpl implements CustomerManager{

    List<Customer> myCustomers = new ArrayList<>();

    @Override
    public List<String> getNames() throws Exception {
        int a = 8;
        //int j=9/0;
        if (a == 8) { // Compared the memory ref
            throw new IDontLikeException("I dont like this...");
        }
        return Arrays.asList("Test1","Test2","Test3","Test4","Test5");
    }

    @Override
    public void persitCustomer(Customer cust) {
        myCustomers.add(cust);
        
    }

    @Override
    public List<Customer> fetchAllCustomer() {
        return myCustomers;
    }
    
}
