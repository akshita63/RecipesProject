package com.demoExample.GlobalException;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.jboss.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.demoExample.Exception.ResourceNotFoundException;


//there is a use of @ControllerAdvice annotation and we can take the help of it



@ControllerAdvice
public class GlobalExceptionHandler {
	
	private final Logger logger=Logger.getLogger( GlobalExceptionHandler.class);
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleNoSuchelement(ResourceNotFoundException e){
		
		
		//give a logger here
		
		
		//I have created a map for displaying the errors in postman,
		Map<String,Object> error=new HashMap();
		
		
		error.put("status", HttpStatus.NOT_FOUND.value());
		error.put("date", LocalDate.now());
		error.put("error", e.getMessage());
		
		
		
				
		
		
		return new  ResponseEntity<>(error,HttpStatus.NOT_FOUND);
		
	}
	
	
	
	
	
	
	
	

}
