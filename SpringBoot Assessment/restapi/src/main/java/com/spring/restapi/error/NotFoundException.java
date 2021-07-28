package com.spring.restapi.error;

public class NotFoundException extends Exception {
   public NotFoundException(String message, Throwable cause){
       super(message,cause);
   }

   public NotFoundException(String message){
       super(message);
   }
}