package com.spring.IOC;

public class Student {
	  private String rno;
	   
	   public String getRno() {
		   return rno;
	   }
	   
	   public void setRno(String rno) {
		   this.rno = rno;
	   }
	   
	   private String sName;
	   
//	   public String getSname() {
//		   return sName;
//	   }
//	   
//	   public void setSname(String sName) {
//		   this.sName = sName;
//	   }
	   
	   public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	   public String toString() {
		   return "Student [rno= " +rno + "sName =" + sName + "]";
	   }

}
