package exc_handling;

import java.util.Scanner;

import custom_exception.SpeedOutOfRangeException;

import static utils.SpeedValidationUtils.validateSpeed;

public class TestCustomException {

	public static void main(String[] args) throws SpeedOutOfRangeException
	{
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter current speed");
			//invoke valiadtion rule
			validateSpeed(sc.nextInt());
			System.out.println("back in main");	
			
		}
//		catch(Exception e) {
//		e.printStackTrace();	
//		}
		System.out.println("main continued...");

	}

}
