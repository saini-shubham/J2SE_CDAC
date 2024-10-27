package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehicleDatePriceComparator implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle v1, Vehicle v2) {
			System.out.println("In compare: based on date and price ");
			
			//date based comparison : java.util.Date already implemented compareTo
			int ret=(v1.getManufactureDate().compareTo(v2.getManufactureDate()));
			if(ret==0)			//if date are equal then go for price
			{
				//we are going for asec order for price
				if(v1.getPrice()<v2.getPrice())
					return -1;						//no swap
				if(v1.getPrice()==v2.getPrice())
					return 0;
				return 1;		//if control reaches here -> v1.getPrice()>v2.getPrice() -> swap ->return 1
			}
			return 0;
	}

}
