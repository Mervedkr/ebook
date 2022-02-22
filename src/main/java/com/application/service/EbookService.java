package com.application.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.application.model.*;
import com.application.repositories.*;


@Service
public class EbookService {
	
	private final BookRepository bookRepository;
	private final CustomerRepository customerRepository;
	private final OrderRepository orderRepository;

	@Autowired
	public EbookService(BookRepository bookRepository, CustomerRepository customerRepository,
			OrderRepository orderRepository) {
		this.bookRepository = bookRepository;
		this.customerRepository = customerRepository;
		this.orderRepository = orderRepository;
	}

	public List<OrderResponse> listAllOrders(Date startDate, Date endDate) {
		List<OrderResponse> response = orderRepository.findAllOrderStartsWithStartDateAndEndsWithEndDate(startDate,endDate);
		return response;
	}

	public void placeNewOrder(OrderRequest request) {
		orderRepository.save(request.getOrder());		
	}

	public void registerNewCustomer(CustomerRequest request) {
		customerRepository.save(request.getCustomer());	
	}

	public Optional<Order> viewOrderDetail(Integer id) {
		Optional<Order> response = orderRepository.findById(id);
		return response;
	}

	public StatisticResponse queryMonthlyStatistic() {
		StatisticResponse response = new StatisticResponse();
		response.setCountOfOrders(orderRepository.findAll().size());
		BigDecimal totalAmount = BigDecimal.ZERO;
		List<OrderResponse> orders = orderRepository.findAllOrderByPurchasedTrue();
		for (int i = 0; i < orders.size(); i++) {
			totalAmount.add(orders.get(i).getOrder().getAmount());
		}
		response.setTotalAmountofAllPurchasedOrders(totalAmount);
		response.setTotalCountOfPurchasedBooks(orderRepository.findAllOrderByPurchasedTrue().size());
		return response;
	}

	public List<OrderResponse> queryAllOrdersOfTheCustomer(CustomerRequest custRequest) {
		List<OrderResponse> response = orderRepository.findAllOrderByCustomerId(custRequest.getCustomer().getCustomerId());
		return response;
	}

	public void registerorUpdateNewBook(BookRequest request) {
		bookRepository.save(request.getBook());
	}

	public Optional<Order> queryOrderById(Integer id) {
		Optional<Order> orders = orderRepository.findById(id);
		return orders;
	}


}
