package com.spring.restapi.service;
import com.spring.restapi.model.Phone;
import java.util.List;
import java.util.Optional;
public interface PhoneService {
    public List<String> getNames() throws Exception;
    
    public void persitPhone(Phone pe);

    public List<Phone> fetchAllPhone();
    
    public Optional<Phone> fetchPhone(Integer id);

    public Boolean save(Phone pe);
}