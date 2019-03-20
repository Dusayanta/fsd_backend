package com.example.java.exceptions;

public class CustomException extends Exception{
	public CustomException() {
		super();
	}
	public CustomException(String message) {
		super(message);
	}
	public CustomException(String message, Throwable cause) {
		super(message,cause);
	}
	

}
