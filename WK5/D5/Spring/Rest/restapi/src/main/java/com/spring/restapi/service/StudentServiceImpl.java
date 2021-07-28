package com.spring.restapi.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.spring.restapi.model.*;
import com.spring.restapi.repo.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo repo;

//    @Override
//    public List<Student> findByLastname(String lname) {
//        return repo.findByLastname(lname);
//    }
//
//    @Override
//    public List<Student> byLastOrFirstname(String lname, String fname) {
//        return repo.byLNFN(lname, fname);
//    }

    @Override
    public Boolean save(Student stu) {
        repo.save(stu);

        return true;
    }

    @Override
    public List<Student> fetchAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Student> fetchById(Integer id) {
        return repo.findById(id);
    }
    
}