package utils;


import java.text.ParseException;
import java.util.Date;

import com.app.core.Color;
import com.app.core.Vehicle;

import cust_exception.VehicleValidationException;
import static com.app.core.Vehicle.sdf;
public class VehicleValidationRules {
	public static final double MIN_PRICE;
	public static final double MAX_PRICE;
	public static Date startDate;
	public static  Date endDate;
	
	static {
		MIN_PRICE=10000;
		MAX_PRICE=100000;
	
		try {
			startDate=sdf.parse("1-4-2020");
			endDate=sdf.parse("");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Vehicle validateAllInputs(String chasisNo,String color,double price, String manufacturerDate, Vehicle[] store) throws VehicleValidationException, ParseException
	{		
			checkForDup(chasisNo,store);
			Color validatedColor=validateColor(color);
			validatePrice( price);
			Date validatedDate= validateDate( manufacturerDate);
			return new Vehicle(chasisNo,validatedColor,price,validatedDate);

	}
	
	
	public void checkForDup(String chasisNo,Vehicle[] store) throws VehicleValidationException {
		Vehicle newVeh=new Vehicle(chasisNo);
		for(Vehicle v1:store) {
			if(v1.equals(newVeh))
				throw new VehicleValidationException ("Duplicate chassis number");
			
			}
		}
		

	public static Color validateColor(String clr) throws IllegalArgumentException
	{
		return Color.valueOf(clr.toUpperCase());
	}
	
	public static void validatePrice(double price) throws VehicleValidationException {
		if(price<MIN_PRICE || price >MAX_PRICE)
			throw new VehicleValidationException("Please enter a price within range");
		
	}
	public Date validateDate(String date) throws ParseException,VehicleValidationException {
		
		//parsing and then formatiing
		//SimpleDateFormat sdf = new SimpleDatezFormat;
		Date d1=sdf.parse(date);
		if(d1.before(startDate)||d1.after(endDate))
			throw new VehicleValidationException("Please enter valid date");
		return d1;
	}
	
	}	
	
	
	
	
	
	
	
	
	
