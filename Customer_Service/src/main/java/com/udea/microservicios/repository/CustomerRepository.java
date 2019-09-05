package com.udea.microservicios.repository;

import org.springframework.data.repository.CrudRepository;

import com.udea.microservicios.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	Customer findByCustomerId(Integer customerId);
}
