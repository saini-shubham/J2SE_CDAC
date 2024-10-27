package custom_exception;

@SuppressWarnings("serial")  //supress warning relatd to serializtion
public class SpeedOutOfRangeException extends Exception {
	public SpeedOutOfRangeException (String mesg) {
		//super();   //display only null -> see in java docs
		super(mesg); /* why creating a paramerised ctor ?
						Ans: go to exception class and read three ctor mentoined there*/
	}

}
