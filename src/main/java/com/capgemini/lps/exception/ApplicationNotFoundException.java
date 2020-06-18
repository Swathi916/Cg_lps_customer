package com.capgemini.lps.exception;

public class ApplicationNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public  ApplicationNotFoundException(String message) {
		super(message);
	}

}

