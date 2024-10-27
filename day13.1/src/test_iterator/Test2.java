package test_iterator;
import static utils.ShowroomUtils.populateVehicleList;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import com.app.core.Vehicle;
public class Test2 {

	public static void main(String[] args) throws ParseException {
		//get populated list of vehicles

		ArrayList<Vehicle> vehicleList=populateVehicleList();
		System.out.println("Vehicel list using explicit iterator");
		Iterator<Vehicle> vehicleItr=vehicleList.iterator();
		System.out.println("Class loaded for itr:"+vehicleItr.getClass());   //java.uitl.ArrayList$Itr
		while(vehicleItr.hasNext()) {
				vehicleItr.next();
				vehicleItr.remove();
				//vehicleItr.remove();		// Illegal State Exception
		}
				System.out.println("Vehicle list after remove");
			System.out.println(vehicleList);
			
		
	}

}
