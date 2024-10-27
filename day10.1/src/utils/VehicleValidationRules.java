package utils;

import java.util.Date;
import java.text.ParseException;
import com.app.core.Color;
import com.app.core.Vehicle;
import custom_exception.VehicleValidationException;
import static com.app.core.Vehicle.sdf;

public class VehicleValidationRules {
	public static final double MIN_PRICE;
	public static final double MAX_PRICE;
	public static Date startDate; 				/*we haven't used final keyworrd here: Reason 
												javac allow intilization of primitive type declare 
												as final somewhere else but if refrence type is declared
												as final you won't be able to intilize using static 
												intilizer block*/
	public static Date endDate;
	static {
		MIN_PRICE=10000;
		MAX_PRICE=1000000;
		
		try {
			startDate=sdf.parse("1-4-2022");
			endDate=sdf.parse("31-3-2023");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//add static method methods for validation
	// store=vehicles ->store will be pointing to same object pointed by vehicles
	public static Vehicle validateAllInputs(String chasisNo, String color, double price, String manufactureDate,Vehicle[] store) throws ParseException,IllegalArgumentException,VehicleValidationException
	{
		checkForDup(chasisNo,store);
		Color validatedColor=validateColor(color);
		validatePrice(price);
		Date validatedDate=validateDate(manufactureDate);
		
		// -> if control reacher here -> everyting is good -> return refernce
		return new Vehicle(chasisNo,validatedColor,price,validatedDate);
	}
	
	
	
	//add a staic method for checking duplicatechasis number 
	public static void checkForDup(String chasisNo,Vehicle[] store) throws VehicleValidationException
	{
		//showroom:{v1(abc-1234,.....),v2(abc-1235...),v3(abc=1230....),v4,null,null...................,null}
		Vehicle newVehicle=new Vehicle(chasisNo);
		for(Vehicle v:store) 
			if(v!=null)
			//if(v.equals(chasisNo))		//chasis number is string and how can ypu comppare string with chasis no?
				if(v.equals(newVehicle))
					throw new VehicleValidationException("Duplicate Chasis number");
		
		System.out.println("No duplicate chasis number");
	}
	
	
	
	//add a static method for validting color
	public static Color validateColor(String str) throws IllegalArgumentException
	/*there is a possiblity (although minimum )user may chooses wrong colour and it gives illegal argument exception and code will abort
	 * so it is always advised to handle this by throws keyword*/ 
	{
		return Color.valueOf(str.toUpperCase());  
	}
	
	
	
	
	//validating price
	public static void validatePrice(double price) throws VehicleValidationException {
		if(price<MIN_PRICE || price>MAX_PRICE) {
			throw new VehicleValidationException("Invalid Price!!");
		}
		//if control come here -> normally continues
	}
	
	
	
	
	
	public static Date validateDate(String date) throws ParseException,VehicleValidationException{
		//parse and then valid it
		Date d1=sdf.parse(date);			//we have already instantiated SimpleDateFormat in Vehicle class
		//parsing successful and now validate the date
		
//		Date startDate=sdf.parse("1-4-2022");
//		Date endDate=sdf.parse("31-3-2023");   -> better to declare it as static and intialize using static blocks
		if(d1.before(startDate)||d1.after(endDate))
			throw new VehicleValidationException("Invalid date");
		return d1;
	
	}
	
	
}
