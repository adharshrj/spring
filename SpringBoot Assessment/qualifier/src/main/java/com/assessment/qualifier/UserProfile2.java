package com.assessment.qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserProfile2 {
   @Autowired
   @Qualifier("User2")
   private User user;

   public void fetchName() {
      System.out.println("Name : " + user.getName() );
   }
   public void fetchAge() {
      System.out.println("Age : " + user.getAge() );
   }
   public void fetchPhone() {
      System.out.println("Phone :" + user.getPhone());
   }
}