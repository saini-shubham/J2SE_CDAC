package test_iterator;
import static utils.ShowroomUtils.populateVehicleList;
import static utils.VehicleValidationRules.validateDate;
import com.app.core.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.Vehicle;
public class Test3 {

	public static void main(String[] args) throws ParseException {
		try(Scanner sc= new Scanner(System.in)){
		ArrayList<Vehicle> vehicleList=populateVehicleList();
		System.out.println("Vehicle list using explicit itterator");
		Iterator<Vehicle> vehicleItr=vehicleList.iterator();
		System.out.println("class loaded for itr"+vehicleItr.getClass());  //java.util.ArrayList$Itr
		while(vehicleItr.hasNext()) {
			vehicleItr.next();
			vehicleItr.remove();
			//vehicleItr.remove();  //ISE
		}// as soon as this loop is over, cursor is after the last element
		System.out.println(vehicleItr.hasNext());	//FALSE as cursor is placed after last element -> 	
		
		System.out.println("Vehicle list after remove");
		System.out.println(vehicleList);
		}	
		}
	}

