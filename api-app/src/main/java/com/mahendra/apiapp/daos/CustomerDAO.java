package com.mahendra.apiapp.daos;

import java.util.List;

import com.mahendra.apiapp.models.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDAO extends JpaRepository<Customer, String> {

    @Query("from Customer c where c.name = :name")
    List<Customer> findByName(String name);

    @Query("from Customer c where c.city = :city")
    List<Customer> findByCity(String city);

}