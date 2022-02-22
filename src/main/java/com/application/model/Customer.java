package com.application.model;
import javax.persistence.*;

@Entity
@Table(name = "CUSTOMER", schema="EB")
public class Customer {
	@Id
	@Column(name = "CustomerId")
	private Integer customerId;
	
	@Column(name = "CustomerName")
	private String customerName;

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
