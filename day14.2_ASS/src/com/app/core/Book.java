package com.app.core;

import java.time.LocalDate;

public class Book {
	private String title;
	private Category category;
	private double price;
	private LocalDate publishDate;
	private String authorNamel;
	private int quantity;
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthorNamel() {
		return authorNamel;
	}

	public void setAuthorNamel(String authorNamel) {
		this.authorNamel = authorNamel;
	}
	
}
