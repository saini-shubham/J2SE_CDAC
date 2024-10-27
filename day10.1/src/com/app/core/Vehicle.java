package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.app.core.DeliveryAddress;

/*
 * Accept vehicle details : chasisNo(string) : unique: PK, color(string) , price(double) , manufactureDate(Date)
 */
public class Vehicle {
	private String chasisNo;
	private Color color;
	private double price;
	private Date manufactureDate;
	
	//explicit HAS-A relationship
	private DeliveryAddress address;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd-MM-yyyy");
	}
	public Vehicle(String chasisNo, Color color, double price, Date manufactureDate) {
		super();
		this.chasisNo = chasisNo;
		this.color = color;
		this.price = price+color.getAdditionalCost();
		this.manufactureDate = manufactureDate;
	}
	
	
	//generating a ctor for primar key
	public Vehicle(String chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}



	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		if(address==null)
			sb.append("Not yet sold");
		else
			sb.append(""+address);
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufactureDate="
				+ sdf.format(manufactureDate) + "]"+sdf.format(manufactureDate)+address;
	}
	
	//simply override equals method inherited method inherited from object class: to replace ref equality by contecnt equality
    //not over ridden annotation-> see testvheicleequality1 and testvheicleequality2
	//	public boolean equals(Vehicle anotherVehicle) {
	//	return this.chasisNo.equals(anotherVehicle.chasisNo);   // whom equals is invokes here ?
	
	@Override
	public boolean equals(Object o) {
		System.out.println("in vehicles's equals");
		if(o instanceof Vehicle)
		{	Vehicle v=(Vehicle)o;
			return this.chasisNo.equals(v.chasisNo);   //downcasting
			
		}
		return false;
	}
	
	//add a non static method to assign delivery address to "this" vehicle
	//rem: as soon as you see this -> non static method only
	public void assigndeliveryAddress(String city, String state, String country, String zipCode)
	{
		this.address=new DeliveryAddress(city, state, country, zipCode);
		//this.address=new DeliveryAddress(city, state, country, zipCode); //connection established between vehidle and delivery Address
	}
	
	
	public void setPrice(double  price) {
		this.price=price;
	}
	public Color getColor() {
		return color;
	}


	public DeliveryAddress getAddress() {
		return address;
	}


	



	
	
	

}
