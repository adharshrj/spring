package com.spring.restapi.service;


import java.util.List;

import java.util.Optional;


import com.spring.restapi.model.Phone;
import com.spring.restapi.repo.PhoneRepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService{
	  @Autowired
	    private PhoneRepo prepo;

	@Override
	public List<String> getNames() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void persitPhone(Phone pe) {
		prepo.save(pe);
		
	}

	@Override
	public List<Phone> fetchAllPhone() {
		return prepo.findAll();
	}

	@Override
	public Optional<Phone> fetchPhone(Integer id) {
		return prepo.findById(id);
	}

	@Override
	public Boolean save(Phone ph) {
		prepo.save(ph);
		return true;
	
	}
}