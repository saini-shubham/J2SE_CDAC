package custom_exception;

public class BankingException extends Exception {
	public BankingException(String msg) {
		super(msg);
	}

}
