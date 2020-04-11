package com.mahendra.apiapp.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/", produces = "application/json")
public class HomeController {

	@GetMapping("/health")
	public ResponseEntity<String> health() {
		return new ResponseEntity<String>("{\"status\":\"Up\"}", HttpStatus.OK);
	}

	@Value("${spring.application.name}")
	private String appname;

	@Value("${spring.application.author}")
	private String author;

	@GetMapping("/")
	public Map<String, String> info() {
		Map<String, String> result = new HashMap<String, String>();
		result.put("name", appname);
		result.put("author", author);
		result.put("ListAll", "/api/customers");
		return result;
	}
}
