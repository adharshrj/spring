package com.spring.restapi.service;
import com.spring.restapi.model.Customer;
import java.util.List;
import java.util.Optional;
public interface CustomerService {
    public List<String> getNames() throws Exception;
    
    public void persitCustomer(Customer cust);

    public List<Customer> fetchAllCustomer();
    
    public Optional<Customer> fetchCustomer(Integer id);

    public Boolean save(Customer cus);
}