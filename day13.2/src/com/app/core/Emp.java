package com.app.core;

public class Emp {
	private String id;
	private String name;
	private double salary;
	public Emp(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	//treat id as PK of Emp 
	
	@Override
	public boolean equals(Object o) {
		System.out.println("in emp equals");
		if(o instanceof Emp) {
			Emp e =(Emp)o;
			return this.id.equals(e.id);
			
		}
		return false;
	}
	
	//Override the hashCode
	@Override
	public int hashCode() {
		System.out.println("In emp's hashCode");
		return id.hashCode();			// string class has overridden the hashCode -> see the declaration
	}
	

}
