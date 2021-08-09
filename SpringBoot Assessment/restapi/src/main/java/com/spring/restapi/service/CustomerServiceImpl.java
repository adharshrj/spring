package com.spring.restapi.service;

import java.util.List;
//import java.util.Calendar;
//import java.util.Collection;
//import java.util.GregorianCalendar;
//import java.util.HashMap;
//import java.util.Map;
import java.util.Optional;

//import javax.annotation.PostConstruct;


import com.spring.restapi.model.Customer;

import com.spring.restapi.repo.CustomerRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{

//    List<Customer> myCustomers = new ArrayList<>();
//
//    @Override
//    public List<String> getNames() throws Exception {
//        int x = 12;
//        
//        if (x == 12) { 
//            throw new NotFoundException("Throwing Not Eound Exception");
//        }
//        return Arrays.asList("A","B","C","D","E");
//    }
//
//    @Override
//    public void persitCustomer(Customer cust) {
//        myCustomers.add(cust);
//        
//    }
//
//    @Override
//    public List<Customer> fetchAllCustomer() {
//        return myCustomers;
//    }
//
//	@Override
//	public Optional<Customer> fetchCustomer() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
    @Autowired
    private CustomerRepo crepo;

//    @Override
//    public List<Student> findByLastname(String lname) {
//        return repo.findByLastname(lname);
//    }
//
//    @Override
//    public List<Student> byLastOrFirstname(String lname, String fname) {
//        return repo.byLNFN(lname, fname);
//    }

    
	@Override
    public Boolean save(Customer cus) {
        crepo.save(cus);

        return true;
    }

    @Override
    public List<Customer> fetchAllCustomer(){
        return crepo.findAll();
    }

    @Override
    public Optional<Customer> fetchCustomer(Integer id) {
        return crepo.findById(id);
    }

	@Override
	public List<String> getNames() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void persitCustomer(Customer cust) {
		crepo.save(cust);
		
		
	}
    
}