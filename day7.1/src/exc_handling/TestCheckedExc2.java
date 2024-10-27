package exc_handling;

public class TestCheckedExc2 {

	public static void main(String[] args) throws Throwable {
		testMe();
		System.out.println("main continued...");
	}
	private static void testMe() throws InterruptedException {
		System.out.println("Before");
		Thread.sleep(5000);
		System.out.println("After");
	}

}
