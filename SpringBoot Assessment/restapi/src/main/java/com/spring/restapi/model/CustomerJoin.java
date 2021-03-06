package com.spring.restapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_customer_join")
public class CustomerJoin {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
		private int id;

	    private String name;

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public CustomerJoin(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    @Override
	    public String toString() {
	        return "CustomerJoin [id=" + id + ", name=" + name + "]";
	    }
}
