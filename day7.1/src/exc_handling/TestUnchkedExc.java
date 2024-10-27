package exc_handling;

public class TestUnchkedExc {
	
	public static void main(String [] args) {
      try {
		testMe();
		System.out.println("after method call");
		}
		catch(Exception e){
			System.out.println("In main() catch");
			//System.out.println(e.getMessage());
			//System.out.println(e);
		}
		System.out.println("main continued");
	}
private static void testMe() {
	try {
	int a=10,b=4;
	System.out.println("res="+(a/b)); //arithmectic exc
	System.out.println("int value "+Integer.parseInt("12345"));  //number format exc
//	String s =null; 
//	System.out.println("chat at index 0"+s.charAt(0)); //null pointer exc
	String[] names= {"aa","bb","cc"};
	System.out.println(names[3]);  //ArrayIndexOutBound exc
	System.out.println("End of method");
	}
	catch(ArithmeticException e) {
		System.out.println("1");
	}
	catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
		System.out.println("2");
		
	}
	System.out.println("End of testMe method");
	
}


}


//co