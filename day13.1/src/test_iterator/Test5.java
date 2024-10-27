package test_iterator;
import static utils.ShowroomUtils.populateVehicleList;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;

import com.app.core.Vehicle;
public class Test5 {

	public static void main(String[] args) throws ParseException {
		//get populated list of vehicles

		ArrayList<Vehicle> vehicleList=populateVehicleList();
		System.out.println("Vehicel list using explicit iterator");
		Iterator<Vehicle> vehicleItr=vehicleList.iterator();  //attaching an iterator -> cursor will be placed before first element
		
		//removing first vehicle
		vehicleList.remove(0);	//removes the first element -> remaining elements shifts to left -> This is Structural modification
		/*After Structural modification attached iterator becomes inconsistent and therefore
		 after Structural modification JVM prefers to give error:ConcurrentModificationException */
		
		//vehicleItr=vehicleList.iterator(); //Attaching the iterator again after structural modification
		while(vehicleItr.hasNext())
			System.out.println(vehicleItr.next());		 //ConcurrentModificationException
		
	}

}
