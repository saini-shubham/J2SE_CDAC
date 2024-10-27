package exc_handling;

public class TestFinally1 {
	public static void main(String[] args) {
		System.out.println("1");
		try {
			testMe();
			
		}
		catch(Exception e){
			
		}
		finally {}
		
	}
	private static void testMe()  {
		try {
			System.out.println("in meth's try");
			String[] ss={"aa","bb"};
			System.out.println(ss[0]);
			boolean flag=false;
			if(flag)
				return;
			
		}
		finally {
			System.out.println("in meth's finally");
		}
	}
}
