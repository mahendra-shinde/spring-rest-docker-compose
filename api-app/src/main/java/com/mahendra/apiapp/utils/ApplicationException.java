package com.mahendra.apiapp.utils;

public class ApplicationException extends RuntimeException {

	public ApplicationException(String message, Throwable throwable) {
		super(message,throwable);
	}

	public ApplicationException(String message) {
		super(message);
	}
	
}
