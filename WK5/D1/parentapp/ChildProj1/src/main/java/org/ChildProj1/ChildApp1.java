package org.ChildProj1;

import org.apache.commons.codec.digest.DigestUtils;

public class ChildApp1 {

//	public ChildApp1() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(DigestUtils.sha256Hex("1234578"));
      
      String s1 = "Hello";
      String s2 = "I am Adharsh";
      String s3 = "";
      String s4 = "Maven";
      
      System.out.println(s1.isEmpty());     
      System.out.println(s2.isEmpty()); 
      System.out.println(s3.isEmpty());      
      System.out.println(s4.isEmpty()); 
      System.out.println(s1.toLowerCase());
      System.out.println(s1.concat(s2));
      System.out.println(s1.replace('H','G'));
      System.out.println(s1.equalsIgnoreCase(s2)); 
      

	}

}
