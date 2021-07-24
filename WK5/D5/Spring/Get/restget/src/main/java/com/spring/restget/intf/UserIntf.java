package com.spring.restget.intf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.restget.model.User;

@Repository
public interface UserIntf extends JpaRepository<User, Long> {

}