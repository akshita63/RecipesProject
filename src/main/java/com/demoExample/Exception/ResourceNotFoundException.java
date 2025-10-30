package com.demoExample.Exception;


//this is a custom exception
public class ResourceNotFoundException extends RuntimeException {
	
	
	
	public ResourceNotFoundException(String message) {
		super(message);
	}

}
