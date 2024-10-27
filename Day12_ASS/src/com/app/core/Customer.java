package com.app.core;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer>{
	private int id;
	private String name;
	private String email;
	private String password;
	private double regAmount;
	private Date dob;
	private static int counter;
	private ServicePackage plan;
	private Adhar adhar;			//to establish one to one association(composition)
	public static SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	static {
		counter=1;
	}
	{
		id=counter++;
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
	
	public String getPassword() {
		return password;
	}

	//ctor to wrap primary key
	public Customer(String email, Date dob) {
		this.email = email;
		this.dob = dob;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		if(this.adhar!=null)  //append only if adhar is linked
			sb.append(adhar);
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", regAmount="
				+ regAmount + ", dob=" + sdf.format(dob) + ", plan=" + plan + sb;
	}
	
//	public String getName() {
//		return name;
//	}

	@Override
	public boolean equals(Object o) {
		if(o instanceof Customer)		//if you don't do instance of checking -> ClassCastException
		{
			Customer cust =(Customer) o;
			return this.email.equals(cust.email)&&this.dob.equals(cust.dob);
		}
		return false;
	}
	
	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public void setPlan(ServicePackage plan) {
		this.plan = plan;
	}

	public ServicePackage getPlan() {
		return plan;
	}

	public Date getDob() {
		return dob;
	}

	public String getEmail() {
		return email;
	}
	
	
	public Adhar getAdharLink() {
		return adhar;
	}


	// inner Adhaar class
	public class Adhar {
		private String adhharId;
		private String location;
		public Adhar(String adhharId, String location) {
			super();
			this.adhharId = adhharId;
			this.location = location;
		}
		@Override
		public String toString() {
			return "Adhar [adhharId=" + adhharId + ", location=" + location + "]";
		}
		

	}//end of inner class
	
	//method to link adhhar with customers details
	//this need to be non static as it going to refer current class reference
	public  void linkAdhar(String id,String location) {
		this.adhar= new Adhar(id,location);
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public int compareTo(Customer o) {
		int ret = this.email.equals(o.email);
	}

	
	
}
