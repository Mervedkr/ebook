package com.application.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.application.model.*;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{
	 List<OrderResponse> findAllOrderByCustomerId(Integer customerId);
	 List<OrderResponse> findAllOrderStartsWithStartDateAndEndsWithEndDate(Date startDate, Date endDate);
	 List<OrderResponse> findAllOrderByPurchasedTrue();
}
