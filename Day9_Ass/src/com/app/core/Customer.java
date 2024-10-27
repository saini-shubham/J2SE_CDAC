package com.app.core;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer {
	private int id;
	private String name;
	private String email;
	private String password;
	private double regAmount;
	private Date dob;
	private static int counter;
	private ServicePackage plan;
	public static SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	static {
		counter=1;
	}
	{
		id=counter++;
	}
	{
		
	}
	public Customer(String name, String email, String password,Date dob,double regAmount , ServicePackage plan) {
		this(email,dob);
		this.name = name;
		//this.email = email;
		this.password = password;
		this.regAmount=regAmount;
		//this.dob = dob;
		this.plan=plan;
	}
	
	public Customer(String email, Date dob) {
		
		this.email = email;
		this.dob = dob;
	}

	
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", regAmount="
				+ regAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Customer)		//if you don't do instance of checking -> ClassCastException
		{
			Customer cust =(Customer) o;
			return this.email.equals(cust.email);
		}
		return false;
	}
	
	public String getEmail() {
		return email;
	}
	
//	public String getDob() {
//		return dob;
//	}
	
//	public String toString() {
//		return "id:"+ counter++ +"name"+this.name+
//	}
	
}
