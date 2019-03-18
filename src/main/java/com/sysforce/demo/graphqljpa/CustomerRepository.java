package com.sysforce.demo.graphqljpa;

import java.util.List;

import com.sysforce.demo.graphqljpa.entity.Customer;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}