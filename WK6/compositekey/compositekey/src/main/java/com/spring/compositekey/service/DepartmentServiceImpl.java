package com.spring.compositekey.service;
import com.spring.compositekey.model.*;
import com.spring.compositekey.service.*;
import com.spring.compositekey.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    @Override
    public Department getDepartment(String CCX, String SRM) {
        DepartmentId departmentId = new DepartmentId();
        departmentId.setName("CCX");
        departmentId.setLocation("SRM");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}