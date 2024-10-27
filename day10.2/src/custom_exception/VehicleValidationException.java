package custom_exception;

@SuppressWarnings("serial")
public class VehicleValidationException extends Exception{
	public VehicleValidationException(String errorMsg) {
		super(errorMsg);
	}
	

}
