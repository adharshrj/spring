package com.spring.restapi.repo;
import java.util.List;
import java.util.Optional;

import com.spring.restapi.model.Customer;
import com.spring.restapi.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface PhoneRepo extends JpaRepository<Phone,Integer> {
}