package utils;

import java.text.ParseException;
import java.util.Date;
import java.util.ServiceConfigurationError;
import java.util.regex.Pattern;

import com.app.core.Customer;
import com.app.core.ServicePackage;

import cust_excp.CustomerValidationException;
import static com.app.core.Customer.sdf;

public class CustomerValidationRules {
		public static Date firstDate;
		static {
			try {
				firstDate=sdf.parse("1-1-1995");
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		public static Customer validateAllInputs(String name,String email,String password,double regAmount,String dob,String plan,Customer[] cust) throws CustomerValidationException, ParseException {
		checkForDup(email,dob,cust);
		validateEmail(email);
		validatePass(password);
		Date validatedDob=  validateDob(dob);
		validateRegAmount(plan,regAmount);
		
		return new Customer(name, email,password,validatedDob,regAmount, ServicePackage.valueOf(plan.toUpperCase()));
	
	}
	

	
	//add a method to validate email
	private static void checkForDup(String email, String dob,Customer[] cust) throws CustomerValidationException, ParseException {
		Customer anotherCustomer=new Customer(email,sdf.parse(dob));
		for(Customer c:cust) 
			if(c !=null)
				if(c.equals(anotherCustomer))
					throw new CustomerValidationException("Dupicate email id and dob");
		System.out.println("No duplicate Email id and dob");	
		
	}

	
	//add a method to validate Email
	public static void validateEmail(String email) throws CustomerValidationException {
		String str=new String(email);
		if(!(str.endsWith(".com") || str.endsWith(".org")))
				throw new CustomerValidationException("Enter valid email id");
		if(!Pattern.matches(".[@].", str)) // [#@$%*\\-]
			throw new CustomerValidationException("Enter valid email id");
	}
	
	
	
	//add a method to validate Password
	public static void validatePass(String password) throws CustomerValidationException 
	{
		String str=new String(password);
		if(!(str.length()>=4&& str.length()<=10))
			throw new CustomerValidationException("Invalid password length");
			
	}

	
	//add a method to validate dob
	public static Date validateDob(String str) throws ParseException,CustomerValidationException {
		//parse and format
		Date d1=Customer.sdf.parse(str);
		//Date d2=Customer.sdf.parse();
		if(d1.after(firstDate))
			throw new CustomerValidationException("Entered DOB is not valid");
		return d1;
	}
	
	
	//add a method to correct reg amount as per selected plan
	public static void validateRegAmount(String plan,Double regAmount) throws CustomerValidationException {
		if(ServicePackage.valueOf(plan.toUpperCase()).getRegAmount()==regAmount);
		else 
			throw new CustomerValidationException("Invalid registaraion Amount!!");
		
		
	}
	
	
}











