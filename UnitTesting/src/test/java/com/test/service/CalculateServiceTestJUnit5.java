package com.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculateServiceTestJUnit5 {
	
	
	@Test
	public void addTwoNumbersTest() {
		int res = CalculateService.addTwoNumbers(12, 12);
		int exp = 24;
		Assertions.assertEquals(res, exp,"Test Failed");
		
	}

}
