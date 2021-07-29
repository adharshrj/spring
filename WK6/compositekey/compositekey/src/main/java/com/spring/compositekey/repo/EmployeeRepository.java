package com.spring.compositekey.repo;

import com.spring.compositekey.model.Employee;
import com.spring.compositekey.model.EmployeeId;
import org.springframework.data.repository.Repository;


public interface EmployeeRepository extends Repository<Employee,EmployeeId>{

    Employee findByEmployeeId(EmployeeId employeeId);
}