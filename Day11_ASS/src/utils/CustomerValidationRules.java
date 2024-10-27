package utils;

import static com.app.core.Customer.sdf;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.Customer;
import com.app.core.ServicePackage;

import cust_excp.CustomerValidationException;

public class CustomerValidationRules {
	private static int MIN_PASS_LEN;
	private static int MAX_PASS_LEN;
	public static Date firstDate;
	public static Date snrDate;
	static {
		MIN_PASS_LEN = 4;
		MAX_PASS_LEN = 10;
		try {
			firstDate = sdf.parse("1-1-1995"); // why haven't you used throws here ? -> throws is there for methods only
			snrDate = sdf.parse("1-1-1962");
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public static Date getSnrDate() {
		return snrDate;
	}

	public static Customer validateAllInputs(String name, String email, String password, double regAmount, String dob,
			String plan, ArrayList<Customer> cust) throws CustomerValidationException, ParseException {
		checkForDup(email, dob, cust);
		validateEmail(email);
		validatePass(password);
		Date validatedDob = validateDob(dob);
		validatePlanRegAmount(plan, regAmount);
		return new Customer(name, email, password, validatedDob, regAmount, ServicePackage.valueOf(plan.toUpperCase()));

	}

	// add a method to validate email
	@SuppressWarnings("unlikely-arg-type")
	private static void checkForDup(String email, String dob, ArrayList<Customer> cust)
			throws CustomerValidationException, ParseException {
		Customer anotherCustomer = new Customer(email, sdf.parse(dob));
		if (cust.contains(anotherCustomer))
			throw new CustomerValidationException("Dupicate email id and dob");
		System.out.println("No duplicate Email id and dob");

	}

	// add a method to validate Email
	public static void validateEmail(String email) throws CustomerValidationException {
		if (email.contains("@") && email.endsWith(".com") || email.endsWith(".org"))
			return;
		else
			throw new CustomerValidationException("Invalid Email");
	}

	// add a method to validate Password
	public static void validatePass(String password) throws CustomerValidationException {
		if (password.length() < MIN_PASS_LEN || password.length() > MAX_PASS_LEN)
			throw new CustomerValidationException("Invalid password length");
		String regex = ".*[#@$%*]+.*";
		if (!password.matches(regex))
			throw new CustomerValidationException("Weak Password");

	}

	// add a method to validate dob
	public static Date validateDob(String str) throws ParseException, CustomerValidationException {
		// parse and format
		Date d1 = Customer.sdf.parse(str);
		// Date d2=Customer.sdf.parse();
		if (d1.after(firstDate))
			throw new CustomerValidationException("Entered DOB is not valid");
		return d1;
	}

	// add a method to correct reg amount as per selected plan
	public static void validatePlanRegAmount(String plan, Double regAmount) throws CustomerValidationException {
		ServicePackage srvPack = ServicePackage.valueOf(plan.toUpperCase());
		if (srvPack.getRegAmount() == regAmount)
			return;
		else
			throw new CustomerValidationException("Invalid registaraion Amount!!");

	}

}
