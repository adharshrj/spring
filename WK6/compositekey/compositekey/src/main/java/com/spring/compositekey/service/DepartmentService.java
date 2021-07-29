package com.spring.compositekey.service;
import com.spring.compositekey.model.Department;

public interface DepartmentService {
    Department getDepartment(String CCX, String SRM);
}