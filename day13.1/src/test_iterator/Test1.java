package test_iterator;
import static utils.ShowroomUtils.populateVehicleList;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import com.app.core.Vehicle;
public class Test1 {

	public static void main(String[] args) throws ParseException {
		//get populated list of vehicles

		ArrayList<Vehicle> vehicleList=populateVehicleList();
		System.out.println("Vehicel list using explicit iterator");
		Iterator<Vehicle> vehicleItr=vehicleList.iterator();  //attaching a iterator -> cursor will be placed before first elemnt
		while(vehicleItr.hasNext())
			vehicleItr.remove();
		System.out.println("Vehicle list afte remove");
		System.out.println(vehicleList);
		
			
		
	}

}
