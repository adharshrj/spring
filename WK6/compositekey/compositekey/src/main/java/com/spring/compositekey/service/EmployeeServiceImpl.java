package com.spring.compositekey.service;
import com.spring.compositekey.model.*;
import com.spring.compositekey.service.*;
import com.spring.compositekey.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployee(String Adharsh, String CCX, String SRM) {
        EmployeeId employeeId = new EmployeeId();
        DepartmentId departmentId = new DepartmentId();
        departmentId.setLocation("SRM");
        departmentId.setName("CCX");
        employeeId.setDepartmentId(departmentId);
        employeeId.setName("Adharsh");
        return employeeRepository.findByEmployeeId(employeeId);
    }
}