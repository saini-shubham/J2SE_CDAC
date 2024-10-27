package tester;

import java.util.Date;

import com.app.core.Color;
import com.app.core.Vehicle;

public class TestComposition {

	public static void main(String[] args) {
		//can you create directly delivery address instance ? -> NO
		// if the access specifier is "public", can it be access from within the outer class instance ? ->YES
		Vehicle.DeliveryAddress adr=new Vehicle("abc-1234",Color.BLACK,12313,new Date()).new DeliveryAddress("a", "b", "c","d");
	}

}
