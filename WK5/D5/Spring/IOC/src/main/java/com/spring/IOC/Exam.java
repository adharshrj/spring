package com.spring.IOC;

public class Exam {

	
   private String eid;
   
   public String getEid() {
	   return eid;
   }
   
   public void setEid(String eid) {
	   this.eid = eid;
   }
   
 private String eName;
   
   public String getEname() {
	   return eName;
   }
   
   public void setEname(String eName) {
	   this.eName = eName;
   }
   
   @Override
   public String toString() {
	   return "Exam [eid= " + eid + ",eName= " + eName + "]" ;
   }
   
   
}


