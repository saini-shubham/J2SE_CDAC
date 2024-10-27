package com.app.core;

public enum ServicePackage {
	SILVER(500),GOLD(1000),DIAMOND(1500),PLATINUM(2000);
	private double regAmount;

	private ServicePackage(double regAmount) {
		this.regAmount= regAmount;
	}
	
	public double getRegAmount() {
		return regAmount;
	}
	
	public String toString() 
	{
		return name()+"@"+regAmount;
	}
	
	

}
