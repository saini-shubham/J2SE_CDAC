package com.app.core;

import java.text.SimpleDateFormat;
//import java.text.SimpleDateFormat;
import java.util.Date;
public class Vehicle{

/*
 * Accept vehicle details : chasisNo(string) : unique: PK, color(string) , price(double) , manufactureDate(Date)
 */
	private String chasisNo;
	private Color color;
	private double price;
	private Date manufactureDate ;
	public static SimpleDateFormat sdf;
	static {
		sdf =new SimpleDateFormat("dd-MM-yyyy");
	}
	public Vehicle(String chasisNo, Color color2, double price, Date manufactureDate) {
		super();
		this.chasisNo = chasisNo;
		this.color = color2;
		this.price = price;
		this.manufactureDate = manufactureDate;
	}
	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufactureDate="
				+ sdf.format(manufactureDate) + "]";
	}
	
//	@Override
//	public String toString() {
//		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufactureDate="
//				+ manufactureDate + "]";
//	}
//	

}
