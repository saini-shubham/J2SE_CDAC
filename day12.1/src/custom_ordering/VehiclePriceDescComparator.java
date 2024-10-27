package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehiclePriceDescComparator implements Comparator<Vehicle>{
	
	@Override
	public int compare(Vehicle v1,Vehicle v2) {
		System.out.println("in price compare");
		
		//NOTE: Descending order
		if(v1.getPrice()<v2.getPrice())      //if v1 price is less -> swap -> return -1.
			return -1;
		if(v1.getPrice()==v2.getPrice())      
			return 0;
		return 1;     //if it reaches -> v1 price is more -> no swap  -> return 1.

		//we can write above code in single line as shown:
//		return ((Double)v1.getPrice()).compareTo(v2.getPrice());
		
	
	}

}
