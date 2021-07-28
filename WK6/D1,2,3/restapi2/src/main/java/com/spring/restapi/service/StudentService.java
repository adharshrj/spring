package com.spring.restapi.service;
import java.util.List;
import java.util.Optional;

import com.spring.restapi.model.*;

public interface StudentService {
//    public List<Student> findByLastname(String lname);

    public Boolean save(Student stu);

//    public List<Student> byLastOrFirstname(String lname,String fname);

    public List<Student> fetchAll();

    public Optional<Student> fetchById(Integer id);
}