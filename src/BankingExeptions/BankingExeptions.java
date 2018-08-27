package BankingExeptions;

public abstract class BankingExeptions extends RuntimeException{
	
	private static final long serialVersionUID = 2426072236980664768L;

	public BankingExeptions() {
		super();
	}
	
	public BankingExeptions(String message) {
		super(message);
	}
}
