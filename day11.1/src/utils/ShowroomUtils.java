package utils;

import static com.app.core.Vehicle.sdf;
import static utils.VehicleValidationRules.validatePrice;

import java.text.ParseException;
import java.util.ArrayList;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exception.VehicleValidationException;
public class ShowroomUtils {
	// add a static method to update base price
	public static String updateBasePrice(String chasisNo, double newPrice, ArrayList<Vehicle> vehicles) throws VehicleValidationException {
		Vehicle vehicle=findByChasisNo(chasisNo,vehicles);
		//if vehicle found -> now validate new price
		
		validatePrice(newPrice);
		//ctrl reaches here -> validPrice
		vehicle.setPrice(newPrice+vehicle.getColor().getAdditionalCost());
		
		return "Price of the vehicle with chasisno"+chasisNo+"updated";
	}
	
	
	//public static Vehicle findByChasisNo(String chasisNo)  //search for chasis where ?? -> one more argument is required
	public static Vehicle findByChasisNo(String chasisNo,ArrayList<Vehicle> vehicles) throws VehicleValidationException 
	{
		//can you pass chasisNo in equals() ->no -> instance of checking -> and chasisNo is a String ->equals method returns false
		
		//int index = vehicles.indexOf(chasisNo);
		
		Vehicle newVehicle=new Vehicle(chasisNo);
		int index = vehicles.indexOf(newVehicle);
		if(index ==-1)
			throw new VehicleValidationException("Invalid chasis number");
		return vehicles.get(index);
		
	}
	
	public static ArrayList<Vehicle> populateVehicleList() throws ParseException 
	{
		ArrayList<Vehicle> list=new ArrayList<Vehicle>(100);
		list.add(new Vehicle("abc-1234",Color.BLACK,99000,sdf.parse("3-4-2022")));
		list.add(new Vehicle("abc-1235",Color.WHITE,80000,sdf.parse("13-4-2022")));
		list.add(new Vehicle("abc-1232",Color.RED,49000,sdf.parse("23-4-2022")));
		list.add(new Vehicle("abc-1237",Color.SILVER,23000,sdf.parse("17-4-2022")));
		list.add(new Vehicle("abc-1239",Color.WHITE,40000,sdf.parse("7-4-2022")));
		return list;
	}
}
