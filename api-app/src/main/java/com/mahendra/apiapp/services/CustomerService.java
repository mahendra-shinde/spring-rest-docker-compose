package com.mahendra.apiapp.services;

import java.util.List;

import com.mahendra.apiapp.models.Customer;

public interface CustomerService {
    Customer findByCode(String code);

    List<Customer> findByName(String name);

    List<Customer> findByCity(String city);

    List<Customer> findAll();
}