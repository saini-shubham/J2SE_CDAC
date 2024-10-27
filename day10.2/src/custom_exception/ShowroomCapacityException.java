package custom_exception;

@SuppressWarnings("serial")
public class ShowroomCapacityException extends Exception {
	public ShowroomCapacityException(String msg){
		super(msg);
	}
	
}
