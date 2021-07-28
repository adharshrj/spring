package com.spring.restapi.repo;
import java.util.List;
import com.spring.restapi.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    
    // @Query("select new com.org.app.myfirstrestapi.entity.EmployeeJoin(e.id,e.name) from Employee e LEFT JOIN e.phones ep where e.id=ep.emp.id")
    // public List<EmployeeJoin> getData();

    //@Query("select new com.org.app.myfirstrestapi.entity.EmployeePhoneJoin(e.id,e.name,ep.pNumber) from Employee e LEFT JOIN e.phones ep where e.id  = ep.emp.id")
    //jpql
    // @Query("select new com.org.app.myfirstrestapi.entity.EmployeePhoneJoin(e.id,e.name,ep.pNumber) from Employee e LEFT JOIN e.phones ep where e.id  = ep.emp.id")
    // public List<EmployeePhoneJoin> getEmployees();
}
