package utils;
import custom_exception.*;

public class SpeedValidationUtils {
	//better practise is to define constants in one place instead of hardcoding
	public static final int MIN_SPEED;
	public static final int MAX_SPEED;
	
	//best way to intialize static data members is static blocks
	static {
		MIN_SPEED=30;
		MAX_SPEED=80;
	}
	
	//add a static method for speed validation
	//static beacuse as no need to create object
	public static void validateSpeed(int speed)  throws SpeedOutOfRangeException //SpeedOutOfRangeException extends from Exception -> checked exception because we need to satisfy complier
	{   									
		if(speed<MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow!!");
		if(speed>MAX_SPEED)
			throw new SpeedOutOfRangeException("You are driving FAST!!");
		System.out.println("Speed is in RANGE");
	}
}

