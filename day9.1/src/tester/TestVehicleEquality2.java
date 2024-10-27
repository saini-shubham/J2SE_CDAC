package tester;

import java.util.Date;

import com.app.core.Color;
import com.app.core.Vehicle;

public class TestVehicleEquality2 {

	public static void main(String[] args) {
		Object v1=new Vehicle("abc-12",Color.BLACK,5000, new Date());   //upcasting
		Object v2=new Vehicle("abc-12",Color.BLACK,5000, new Date());
		System.out.println(v1.equals(v2));  //t
	}

}
