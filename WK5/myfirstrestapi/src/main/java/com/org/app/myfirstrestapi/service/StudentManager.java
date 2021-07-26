package com.org.app.myfirstrestapi.service;

import java.util.List;
import java.util.Optional;

import com.org.app.myfirstrestapi.entity.Student;

public interface StudentManager {
    public List<Student> findByLastname(String lname);

    public Boolean save(Student stu);

    public List<Student> byLastOrFirstname(String lname,String fname);

    public List<Student> fetchAll();

    public Optional<Student> fetchById(Integer id);

}
