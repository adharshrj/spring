package com.spring.IOC;

public class Scope {
	  private String message;
	   
	   public void setMessage(String message) {
		   this.message=message;
	   }
	   
	   public void getMessage() {
		   System.out.println(message);
	   }
	   
	   private void init() {
		   System.out.println("Bean inititalization");
	   }
	   
	   public void destroy() {
		   System.out.println("Bean Destroyed");
	   }
}
