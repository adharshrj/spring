package com.org.app.myfirstrestapi.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.org.app.myfirstrestapi.entity.Student;
import com.org.app.myfirstrestapi.repo.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class StudentManagerImpl implements StudentManager {

    @Autowired
    private StudentRepo repo;

    @Override
    public List<Student> findByLastname(String lname) {
        return repo.findByLastname(lname);
    }

    @Override
    public List<Student> byLastOrFirstname(String lname, String fname) {
        // TODO Auto-generated method stub
        return repo.byLNFN(lname, fname);
    }

    @Override
    public Boolean save(Student stu) {
        // TODO Auto-generated method stub
        repo.save(stu);

        return true;
    }

    @Override
    public List<Student> fetchAll() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }

    @Override
    public Optional<Student> fetchById(Integer id) {
        // TODO Auto-generated method stub
        return repo.findById(id);
    }
    
}
