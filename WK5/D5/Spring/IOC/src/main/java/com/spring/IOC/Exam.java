package com.spring.IOC;

public class Exam {

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
   
   private String eid;
   
   public String getEid() {
	   return eid;
   }
   
   public void setEid(String eid) {
	   this.eid = eid;
   }
   
   private String eName;
   
   public String geteName() {
	   return eName;
   }
   
   public void seteName(String eName) {
	   this.eName = eName;
   }
   
   
   
   @Override
   public String toString() {
	   return "Exam [eid= " + eid + ",eName= " + eName + "]" ;
   }
   
  
   
   
}


