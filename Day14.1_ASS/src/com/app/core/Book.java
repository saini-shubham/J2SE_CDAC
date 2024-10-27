package com.app.core;

import java.time.LocalDate;

public class Book {
	private String title;
	private Category category;
	private double price;
	private LocalDate publishDate;
	private String authorNamel;
	private int quantity;
	public Book(String title, Category category, double price, LocalDate publishDate, String authorNamel, int quantity) {
		super();
		this.title = title;
		this.category = category;
		this.price = price;
		this.publishDate = publishDate;
		this.authorNamel = authorNamel;
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "lib [title=" + title + ", category=" + category + ", price=" + price + ", publishDate=" + publishDate
				+ ", authorNamel=" + authorNamel + ", quantity=" + quantity + "]";
	}
	
}
