package test_iterator;

import static utils.ShowroomUtils.populateVehicleList;
import static utils.VehicleValidationRules.validateDate;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.Vehicle;

public class Test4 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated list of vehicles
			ArrayList<Vehicle> vehicleList = populateVehicleList();
			System.out.println("Original Vehicle list using expl. Iterator");
			Iterator<Vehicle> vehicleItr = vehicleList.iterator();
			while (vehicleItr.hasNext()) {
				System.out.println(vehicleItr.next());
			}
			//as soon as while loop is over -> cursor is after the last element
			
			System.out.println("Enter date : day-month-yr");
			Date d1=validateDate(sc.next());
			//remove all the vehicles produced before this date
			vehicleItr = vehicleList.iterator();     //re attaching the cursor so that cursor is placed before the first element
			while(vehicleItr.hasNext())
				if(vehicleItr.next().getManufactureDate().before(d1))
					vehicleItr.remove();
			System.out.println("Vehicle list after remove");
			vehicleItr = vehicleList.iterator();   //re attaching the cursor so that cursor is placed before the first element
			while (vehicleItr.hasNext()) {
				System.out.println(vehicleItr.next());
			}			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
