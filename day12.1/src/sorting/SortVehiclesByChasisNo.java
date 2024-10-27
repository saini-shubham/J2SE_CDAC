//Natural Sorting
package sorting;
import static utils.ShowroomUtils.populateVehicleList;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

import com.app.core.Vehicle;

public class SortVehiclesByChasisNo {
	public static void main(String[]args) throws ParseException {
		ArrayList<Vehicle> list=populateVehicleList();
		System.out.println("Original List:"+list);
		for(Vehicle v:list) {
			System.out.println(v);
		
		//API of java.util.Collection
		}
		Collections.sort(list);       //Collections.sort API will automatically invoke comareTo() of Vehicle class
		System.out.println("Vehicles sorted as per chasis no");
		for(Vehicle v:list) {
				System.out.println(v);
		}
		
	}
	
	
	

}
