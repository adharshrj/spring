package org.ChildProj2;
import java.util.*;
import java.text.*;
public class ChildApp2 {

//	public ChildApp2() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
	      System.out.println(date.toString());
	      SimpleDateFormat sdf = new SimpleDateFormat ("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
	      System.out.println("Current Date: " + sdf.format(date));
	}

}
