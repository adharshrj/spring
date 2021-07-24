package com.spring.restapi.model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Customer {
	private int id;
	private String name;
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