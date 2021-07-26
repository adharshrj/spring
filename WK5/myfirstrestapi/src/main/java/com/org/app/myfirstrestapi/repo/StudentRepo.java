package com.org.app.myfirstrestapi.repo;

import java.util.List;

import com.org.app.myfirstrestapi.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    public List<Student> findByLastname(String lname);

    public List<Student> findByLastnameOrFirstname(String lname,String fname);

    @Query("select s from Student s where s.firstname=:fname or s.lastname=:lname")
    public List<Student> byLNFN(String lname,String fname);
}
