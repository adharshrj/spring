package com.spring.restapi.error;
import java.lang.*;
public class NotFoundException extends RuntimeException {

    public NotFoundException(int id) {
        super("id not found : " + id);
    }

}