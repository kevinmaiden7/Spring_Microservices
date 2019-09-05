package com.udea.microservicios.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.udea.microservicios.model.Account;

@FeignClient(name="account-service")
public interface AccountService {
	
	@GetMapping(value = "/account/customer/{customer}")
	List<Account> findByCutomer (@PathVariable("customer") Integer customer);
	
}
