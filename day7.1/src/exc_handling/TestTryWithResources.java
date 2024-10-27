package exc_handling;

import java.util.Scanner;
public class TestTryWithResources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("Enter an int value");
			System.out.println("You entered:"+sc.nextInt());   // What happens if you  enter float?
			System.out.println("End of try");
		}  //JVM automatically invokes sc.close
			
		System.out.println("main over..");

	}

}
