package utils;

import static com.app.core.Customer.sdf;
import static utils.CustomerValidationRules.validateDob;
import static utils.CustomerValidationRules.validateEmail;
import static utils.CustomerValidationRules.validatePass;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.Customer;
import com.app.core.ServicePackage;

import cust_excp.CustomerValidationException;
public class CustomerUtils {

	// sample test date
	public static ArrayList<Customer> populateCustomerList() throws ParseException {
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("Pawan", "@pawan.com", "Pawa@123", sdf.parse("1-2-1990"), 1000, ServicePackage.DIAMOND));
		list.add(new Customer("Madhur", "@Madhur.org", "Madh@123", sdf.parse("1-2-1990"), 1000,
				ServicePackage.PLATINUM));
		list.add(new Customer("Utkarsh", "@Utkarsh.org", "Utka@123", sdf.parse("1-2-1994"), 1000,
				ServicePackage.DIAMOND));
		list.add(new Customer("Lalit", "@Lalit.com", "Lali@123", sdf.parse("12-12-1990"), 1000, ServicePackage.SILVER));
		list.add(new Customer("Niharika", "@Niharika.org", "Niha@123", sdf.parse("21-2-1993"), 1000,
				ServicePackage.GOLD));

		return list;
	}

	// add a static method to validate customer
	public static Customer authenticateCustomer(String email, String dob,String password ,ArrayList<Customer> customers)
			throws CustomerValidationException, ParseException {
		Customer cust=findByPk(email, dob, customers);
		//email and dob is valid -> validate password
		validatePass(password);
		if(!password.equals(cust.getPassword()))
				throw new CustomerValidationException("Invalid Password mismatch");
		else
			System.out.println("Login successful");
		return cust;
	}

	public static Customer findByPk(String email, String dob, ArrayList<Customer> customers) throws CustomerValidationException, ParseException {
		validateEmail(email);
		Date d1=validateDob(dob);
		Customer c = new Customer(email, d1);
		int index=customers.indexOf(c);
		if(index >0)
			return customers.get(index);
		else
			throw new CustomerValidationException("Enter valid emailid or dob");
	}
	
	// add a static method to update password
		public static String updatePassword(String email, String dob ,String password, String newPass,ArrayList<Customer> customers)
			throws CustomerValidationException, ParseException {
		Customer updatePass = findByPk(email, dob, customers);
		//Authentication done
		validatePass(password);
		//validation of password is done
		if(updatePass.getAdharLink()==null)		//checking if adhhar is linked or not
			throw new CustomerValidationException("Can'thange password as Adhaar isnot linked");
		validatePass(newPass);
		updatePass.setPassword(newPass);
		return "Password Udpated Succesfuuly";
	}

}
