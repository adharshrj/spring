package com.spring.collections;
import java.util.*;
public class Collection {
	 List l1;
	 Set  s1;
	 Map  m1;
	 Properties p1;
	 
	 public void setL1(List l1) {
		 this.l1=l1;
	 }
	 
	 public List getL1() {
		 System.out.println("List: " +l1);
		 return l1;
	 }
	 
	 public void setS1(Set s1) {
		 this.s1=s1;
	 }
	 
	 public Set getS1() {
		 System.out.println("Set: " +s1);
		 return s1;
	 }
	 
	 public void setM1(Map m1) {
		 this.m1=m1;
	 }
	 
	 public Map getM1() {
		 System.out.println("Map: " +m1);
		 return m1;
	 }
	 
	 public void setP1(Properties p1) {
		 this.p1=p1;
	 }
	 
	 public Properties getP1() {
		 System.out.println("Properties: " +p1);
		 return p1;
	 }
}
