package exceptionhanding.banking;

public class InsufficientBalance extends Exception {

	InsufficientBalance(String msg) {
		super(msg);
	}
}

