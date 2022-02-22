package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.model.BookRequest;
import com.application.model.BookResponse;
import com.application.model.CustomerRequest;
import com.application.model.OrderRequest;
import com.application.model.OrderResponse;
import com.application.model.StatisticResponse;
import com.application.service.EbookService;

@RestController
@RequestMapping("/books")
public class BookController {
	private final EbookService service;

	@Autowired
	public BookController(EbookService service) {
		this.service = service;
	}

	@PutMapping("/addOrUpdate")
	public void registerorUpdateNewBook(@RequestParam BookRequest request) {
			service.registerorUpdateNewBook(request);
	}
	
}
