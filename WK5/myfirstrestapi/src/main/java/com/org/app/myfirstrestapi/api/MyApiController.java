package com.org.app.myfirstrestapi.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.org.app.myfirstrestapi.config.MyConfig;
import com.org.app.myfirstrestapi.entity.Student;
import com.org.app.myfirstrestapi.service.CustomerManager;
import com.org.app.myfirstrestapi.service.StudentManager;
import com.org.app.myfirstrestapi.vo.CreateStudentRequest;
import com.org.app.myfirstrestapi.vo.CreateStudentRespone;
import com.org.app.myfirstrestapi.vo.Customer;
import com.org.app.myfirstrestapi.vo.MyBean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyApiController extends BaseController {

    Logger logger = LoggerFactory.getLogger(MyApiController.class);

    @Autowired
    private CustomerManager service;

    @Autowired
    private StudentManager stuService;

    @Autowired
    private MyConfig myConfig;

    @Autowired
    private MyBean someMethod;

    @PutMapping(value = "/customer",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> regiserCustomer(@RequestBody Customer cust){
        logger.debug(cust.toString());
        service.persitCustomer(cust);
        return new ResponseEntity<List<Customer>>(service.fetchAllCustomer(),HttpStatus.OK);
    }

    @PostMapping(value = "/customer",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Customer>> updateCustomer(@RequestBody Customer cust){
        System.out.println(cust);
        service.persitCustomer(cust);
        return new ResponseEntity<List<Customer>>(service.fetchAllCustomer(),HttpStatus.OK);
    }


    @GetMapping(value = "/names", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getNames() throws Exception {
        
        List<String> lstConfig = new ArrayList<>();
        lstConfig.add(myConfig.getEc2Url());
        lstConfig.add(myConfig.getEc2Uname());
        lstConfig.add(myConfig.getEc2Pwd());
        lstConfig.add(someMethod.getMessage());

        return new ResponseEntity<List<String>>(lstConfig, HttpStatus.OK);
    }

    
    @GetMapping(value = "/names/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getNamesById(@PathVariable int id) throws Exception {
        System.out.println(id);
        return new ResponseEntity<List<String>>(service.getNames(), HttpStatus.OK);
    }


    @PostMapping(value = "/student",produces = MediaType.APPLICATION_JSON_VALUE)    
    public ResponseEntity<List<Student>> saveStudent(@RequestBody Student stuReq){
        stuService.save(stuReq);

        //CreateStudentRespone stuRes = new CreateStudentRespone();

        System.out.println("====" + stuReq.getId());

        //Integer id = stuService.fetchById(stuReq.getStu().getId());

        //stuRes.setStudentId(stuService.fetchById(stuReq.getStu().getId()).get());

        return new ResponseEntity<List<Student>>(stuService.fetchAll(),HttpStatus.OK);
    }

}
