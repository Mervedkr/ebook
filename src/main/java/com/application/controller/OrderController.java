package com.application.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.application.model.*;
import com.application.service.EbookService;

@RestController
@RequestMapping("/orders")
public class OrderController {
	private final EbookService service;

	@Autowired
	public OrderController(EbookService service) {
		this.service = service;
	}

	@GetMapping("/query{id}")
	public Optional<Order> queryOrderById(@PathParam("id")Integer id) {
		Optional<Order> response;
		response = service.queryOrderById(id);
		return response;
	}

	@GetMapping("/detail{id}")
	public Optional<Order> viewOrderDetail(@PathParam("id")Integer id) {
		Optional<Order> response;
		response = service.viewOrderDetail(id);
		return response;
	}
	
	@PutMapping("/newOrder")
	public void placeNewOrder(@RequestParam OrderRequest request) {
			service.placeNewOrder(request);
	}
	
	@GetMapping("/listOrders")
	public List<OrderResponse> listAllOrders(Date startDate, Date endDate) {
		List<OrderResponse> response = new ArrayList<OrderResponse>();
		response = service.listAllOrders(startDate,endDate);
		return response;
	}
	
	
}
