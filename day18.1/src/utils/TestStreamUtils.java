package utils;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestStreamUtils {
	
	private static StreamUtils ref;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("in setup");
		ref = new StreamUtils();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("in clean up");
		ref = new StreamUtils();
	}

	@Test
//	void test() {
//		fail("Not yet implemented");
	void testCountStrings() {
		long countStrings = ref.countStrings("abc","32342","231","eewfkvdf","324345546","sdf");
		assertEquals(3, countStrings);		//assertEquals(expected, actual)
	}
	
	@Test
	void testFindMax() {
		String findMax = ref.findMax("abc","asd","xyz","sdaffvcx");
		assertEquals("xyz",findMax);
	}
	
}


