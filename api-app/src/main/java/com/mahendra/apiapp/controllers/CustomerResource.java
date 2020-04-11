package com.mahendra.apiapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.apiapp.models.Customer;
import com.mahendra.apiapp.services.CustomerService;


@RestController
@RequestMapping(value="/api/customers",produces="application/json")
public class CustomerResource {

	@Autowired private CustomerService service;
	
	@GetMapping
	public ResponseEntity<List<Customer>> getAll(){
		List<Customer> customers = service.findAll();
		return new ResponseEntity<List<Customer>>(customers,HttpStatus.OK);
	}
	
	@GetMapping("/{code}")
	public ResponseEntity<Customer> findByCode(@PathVariable String code){
		Customer customer = service.findByCode(code);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
}
