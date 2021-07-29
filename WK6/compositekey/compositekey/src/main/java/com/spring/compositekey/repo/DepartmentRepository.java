package com.spring.compositekey.repo;

import com.spring.compositekey.model.Department;
import com.spring.compositekey.model.DepartmentId;
import org.springframework.data.repository.Repository;

public interface DepartmentRepository extends Repository<Department, DepartmentId> {

    Department findByDepartmentId(DepartmentId departmentId);
}