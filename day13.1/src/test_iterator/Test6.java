package test_iterator;
import static utils.ShowroomUtils.populateVehicleList;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import com.app.core.Vehicle;
public class Test6 {

	public static void main(String[] args) throws ParseException {
		//get populated list of vehicles

		ArrayList<Vehicle> vehicleList=populateVehicleList();
		System.out.println("Vehicel list using explicit iterator");
		Iterator<Vehicle> vehicleItr=vehicleList.iterator();  //attaching a iterator -> cursor will be placed brfore first elemnt
		while(vehicleItr.hasNext())
		System.out.println(vehicleItr.next());	
		//display the vehicles in reverse order : using ListItterator
		ListIterator<Vehicle> listItr=vehicleList.listIterator(vehicleList.size());  //cursor will be placed after last element
		System.out.println("Class for ListItr"+listItr);
		System.out.println("Class for ListItr"+listItr.getClass());
		System.out.println("Vehicle list in reverse order");
		while(listItr.hasPrevious())
			System.out.println(listItr.previous());
		
	}

}
