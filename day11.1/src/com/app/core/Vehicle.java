package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

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
	
	
	//generating a ctor for primary key
	public Vehicle(String chasisNo) {
		super();
		this.chasisNo = chasisNo;
	}



	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", price=" + price + ", manufactureDate="
				+ sdf.format(manufactureDate) + "]";
	}
	
	//simply override equals method inherited method inherited from object class: to replace ref equality by contecnt equality
    //not over ridden annotaion-> see testvheicleequality1 and testvheicleequality2
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
	
	
	//defining inner class
	public class DeliveryAddress {
		private String city;
		private String state;
		private String country;
		private String zipCode;  //declaring it as string because it is easy to validate a string using regex
		public DeliveryAddress(String city, String state, String country, String zipCode) {
			super();
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipCode = zipCode;
		}
	
	@Override
	public String toString() {
		return "DeliveryAddress [city=" + city + ", state=" + state + ", country=" + country + ", zipCode=" + zipCode
				+ "]";
		}
	}

	


	



	
	
	

}
