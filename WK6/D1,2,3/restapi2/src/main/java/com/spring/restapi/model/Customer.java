package com.spring.restapi.model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.boot.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.*;
import javax.validation.constraints.*;
import javax.persistence.Entity;
import javax.persistence.Table;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "tbl_customer")
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotEmpty(message = "Please provide a name")
	private String name;
	
	@NotNull(message = "Please provide a salary")
    @DecimalMin("1.00")
	private long salary;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	
    
	public Customer(int id, String name, long salary, Date birthday) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.birthday = birthday;
	}
    public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Customer() {
		super();
	}
	
	public String getName() {
		return this.name;
	}
		
	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	public long getSalary() {
		return this.salary;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public Date getBirthday() {
		return this.birthday;
	}
	
	public String toString() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		
		String cust = String.format("[id = %d, name = %s, salary = %d, birthday = %s]", 
							this.id, this.name, this.salary, dateFormat.format(this.birthday));
		
		return cust;
	}
}