package utils;

import com.app.core.Vehicle;

import custom_exception.VehicleValidationException;
import static utils.VehicleValidationRules.validatePrice;
public class ShowroomUtils {
	// add a static method to update base price
	public static String updateBasePrice(String chasisNo, double newPrice, Vehicle[] vehicles) throws VehicleValidationException {
		Vehicle vehicle=findByChasisNo(chasisNo,vehicles);
		//if vehicle found -> now validate new price
		
		validatePrice(newPrice);
		//ctrl reaches here -> validPrice
		vehicle.setPrice(newPrice+vehicle.getColor().getAdditionalCost());
		
		return "Price of the vehicle with chasisno"+chasisNo+"updated";
	}
	
	
	//public static Vehicle findByChasisNo(String chasisNo)  //search for chasis where ?? -> one more argument is required
	public static Vehicle findByChasisNo(String chasisNo,Vehicle[] vehicles) throws VehicleValidationException 
	{
		//can you pass chasisNo in equals() ->no -> instance of checking -> and chasisNo is a String ->equals method returns false
		Vehicle newVehicle=new Vehicle(chasisNo);
		for(Vehicle v:vehicles)
			if(v!=null)
				if(v.equals(newVehicle))
					return v;   			//will you return chasisNo number or complete referencee?-> complete reference
		//-> if control reaches here -> vehicle not found
		throw new VehicleValidationException("Invalikd Chasis No: vehicle not found!");
		
	}
}
