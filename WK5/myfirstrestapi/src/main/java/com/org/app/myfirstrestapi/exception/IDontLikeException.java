package com.org.app.myfirstrestapi.exception;

public class IDontLikeException extends Exception {
    
    public IDontLikeException(String message, Throwable cause){
        super(message, cause);
    }

    public IDontLikeException(String message){
        super(message);
    }

}
