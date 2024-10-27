package com.test.service;

public class CalculateService {
	
	public static int addTwoNumbers(int a , int b) {
		return a+b;
	}
	
	public static int sumAnyNummber(int ...num) {
		int sum =0;
		for(int i: num) {
			sum+= num[i];
		}
		return sum;
	}

}
