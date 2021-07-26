package com.org.app.myfirstrestapi.api;

import com.org.app.myfirstrestapi.config.MyConfig;
import com.org.app.myfirstrestapi.config.MyErrorConfig;
import com.org.app.myfirstrestapi.exception.IDontLikeException;
import com.org.app.myfirstrestapi.vo.APIError;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @Autowired
    private MyErrorConfig errConfig;

    @ExceptionHandler(value={RuntimeException.class})
    public ResponseEntity<APIError> handleRtException(RuntimeException ex,WebRequest req){

        APIError apiErr = new APIError();
        apiErr.setId(System.currentTimeMillis()+"");
        apiErr.setErrCode("ERR001");
        apiErr.setMessage(errConfig.getErr01().concat(",Please contact your system admin"));
        apiErr.setCategory("General RunTime");

        System.err.println("Error Occured..." + ex.toString());    
        ex.printStackTrace();

        return new ResponseEntity<APIError>(apiErr,HttpStatus.BAD_GATEWAY);
        
    }

    @ExceptionHandler(value={IDontLikeException.class})
    public ResponseEntity<APIError> handleGeneralException(Exception ex,WebRequest req){

        APIError apiErr = new APIError();
        apiErr.setId(System.currentTimeMillis()+"");
        apiErr.setErrCode("ERR002");
        apiErr.setMessage(errConfig.getErr02() + "," + ex.toString()+ "Please contact your system admin");
        apiErr.setCategory("General RunTime");

        System.err.println("Error Occured..." + ex.toString());    
        ex.printStackTrace();

        return new ResponseEntity<APIError>(apiErr,HttpStatus.BAD_REQUEST);
        
    }
    
}
