package com.mahendra.apiapp.utils;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandleExceptions {

	@ExceptionHandler(RuntimeException.class)
	public ResponseEntity<Map<String, String>> showError(RuntimeException ex) {
		Map<String, String> result = new HashMap<>();
		result.put("Error", ex.getMessage());
		
		if (ex.getCause() != null) {
			result.put("Caused-by", ex.getCause().getMessage());
			result.put("exception:", ex.getCause().getClass().getName());
		}
		return new ResponseEntity<Map<String, String>>(result, HttpStatus.BAD_REQUEST);
	}
}
