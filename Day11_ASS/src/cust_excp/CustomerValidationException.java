package cust_excp;

@SuppressWarnings("serial")
public class CustomerValidationException extends Exception {
	public  CustomerValidationException(String errMsg) {
		super(errMsg);
		
	}

}
