package com.application.model;

import javax.persistence.*;

@Entity
@Table(name = "BOOK", schema="EB")
public class Book {
	@Id
	@Column(name = "BookId")
	private Integer bookId;
	
	@Column(name = "BookName")
	private String bookName;
	
	@Column(name = "Purchased")
	private boolean Purchased;

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public boolean isPurchased() {
		return Purchased;
	}

	public void setPurchased(boolean purchased) {
		Purchased = purchased;
	}
}
