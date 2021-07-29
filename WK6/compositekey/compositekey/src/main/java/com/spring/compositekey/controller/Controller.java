package com.spring.compositekey.controller;


import com.spring.compositekey.model.Department;
import com.spring.compositekey.model.Employee;
import com.spring.compositekey.service.DepartmentService;
import com.spring.compositekey.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/employees/{id}")
    public Employee getEmployee(){
        Employee employee= employeeService.getEmployee("Adharsh","CCX","SRM");
        return employee;
    }

    @RequestMapping("/departments/{id}")
    public Department getDepartment(){
        Department department= departmentService.getDepartment("CCX","SRM");
        return department;
    }
}
