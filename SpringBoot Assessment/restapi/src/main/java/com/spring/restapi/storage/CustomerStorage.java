package com.spring.restapi.storage;

import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.spring.restapi.model.Customer;

@Component("customerStorage")
public class CustomerStorage {
	
	private Map<Integer,Customer> _customers = new HashMap();
	
    @PostConstruct
    public void init() throws Exception {
        Customer max = new Customer(1, "Max", 6500, new GregorianCalendar(1989, Calendar.JANUARY, 3).getTime());
        Customer conor = new Customer(2, "Conor", 6700, new GregorianCalendar(1993, Calendar.JUNE, 17).getTime());
        
        Customer aldo = new Customer(3, "Aldo", 8800, new GregorianCalendar(1985, Calendar.MAY, 22).getTime());
 
        _customers.put(max.getId(), max);
        _customers.put(conor.getId(), conor);
        _customers.put(aldo.getId(), aldo);
    }
	
    public void add(Customer customer) {
    	_customers.put(customer.getId(), customer);
    }
    
    public Customer get(int id) {
    	return _customers.get(id);
    }
    
    public Customer delete(int id) {
    	return _customers.remove(id);
    }

    public boolean exists(int id) {
    	if(_customers.containsKey(id)) return true;
    	return false;
    }
    
    public Collection<Customer> getAll() {
    	return _customers.values();
    }   
}