package com.mahendra.apiapp.services;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import com.mahendra.apiapp.daos.CustomerDAO;
import com.mahendra.apiapp.models.Customer;
import com.mahendra.apiapp.utils.ApplicationException;

@Service
public class CustomerServiceImpl implements CustomerService {
	static Logger log = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerDAO dao;

	@Override
	public Customer findByCode(String code) {
		Optional<Customer> result = null;
		try {
			result = dao.findById(code);
			if (!result.isPresent()) {
				log.warn("No record found!");
				throw new ApplicationException("Customer not found: " + code);
			}
		} catch (DataAccessException ex) {
			throw new ApplicationException("could not load customers", ex);
		}
		log.info("Record found");
		return result.get();
	}

	@Override
	public List<Customer> findByName(String name) {
		List<Customer> customers = null;
		try {
			customers = dao.findByName(name);
			log.info("Found " + customers.size() + " records");
		} catch (DataAccessException ex) {
			log.warn("Error occurred: " + ex.getMessage());
			throw new ApplicationException("Could not find customer", ex);
		}
		if (customers == null || customers.isEmpty())
			throw new ApplicationException("No customers with name " + name + " found!");
		return customers;
	}

	@Override
	public List<Customer> findByCity(String city) {
		List<Customer> customers = null;
		try {
			customers = dao.findByCity(city);
			log.info("Found " + customers.size() + " records");
			if (customers == null || customers.isEmpty()) {
				throw new ApplicationException("No customers in city " + city + " found!");
			}
		} catch (DataAccessException ex) {
			throw new ApplicationException("Could not find any customers", ex);
		}
		return customers;
	}

	@Override
	public List<Customer> findAll() {
		try {
		return dao.findAll();
		}catch(DataAccessException ex) {
			log.error("Unable to fetch results", ex);
			throw new ApplicationException("Unable to get customers",ex);
		}
	}

}
