package com.application.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.application.model.*;
import com.application.service.EbookService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	private final EbookService service;

	@Autowired
	public CustomerController(EbookService service) {
		this.service = service;
	}
	@PutMapping("/newCustomer")
	public void registerNewCustomer(@RequestParam CustomerRequest request) {
			service.registerNewCustomer(request);
	}
	
	@GetMapping("/query")
	public List<OrderResponse> queryAllOrdersOfTheCustomer(@RequestParam CustomerRequest request) {
		List<OrderResponse> response = new ArrayList<OrderResponse>();
		response = service.queryAllOrdersOfTheCustomer(request);
		return response;
	}	
	
}
