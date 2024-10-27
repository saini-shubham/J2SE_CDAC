package exc_handling;

public class TestCheckedExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testMe();

	}
	private static void testMe() {
		System.out.println("Before");
		try {
		Thread.sleep(5000);
		}
		catch(InterruptedException e)   //In current scenario(single thread env) there is no possiblity of getting an Interrupted Exception
		{
			System.out.println("in IE");
		}
		System.out.println("After");
	}

}
