package com.application.model;

import java.math.BigDecimal;

public class StatisticResponse {
	private Integer countOfOrders;
	private BigDecimal totalAmountofAllPurchasedOrders;
	private Integer totalCountOfPurchasedBooks;
	
	public Integer getCountOfOrders() {
		return countOfOrders;
	}
	public void setCountOfOrders(Integer countOfOrders) {
		this.countOfOrders = countOfOrders;
	}
	public BigDecimal getTotalAmountofAllPurchasedOrders() {
		return totalAmountofAllPurchasedOrders;
	}
	public void setTotalAmountofAllPurchasedOrders(BigDecimal totalAmountofAllPurchasedOrders) {
		this.totalAmountofAllPurchasedOrders = totalAmountofAllPurchasedOrders;
	}
	public Integer getTotalCountOfPurchasedBooks() {
		return totalCountOfPurchasedBooks;
	}
	public void setTotalCountOfPurchasedBooks(Integer totalCountOfPurchasedBooks) {
		this.totalCountOfPurchasedBooks = totalCountOfPurchasedBooks;
	}
	
	@Override
	public String toString() {
		return "StatisticResponse [countOfOrders=" + countOfOrders + ", totalAmountofAllPurchasedOrders="
				+ totalAmountofAllPurchasedOrders + ", totalCountOfPurchasedBooks=" + totalCountOfPurchasedBooks + "]";
	}
	
}
