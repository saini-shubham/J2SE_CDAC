package com.app.core;

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
