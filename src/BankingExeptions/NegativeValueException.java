package BankingExeptions;

public class NegativeValueException extends BankingExeptions{

	private static final long serialVersionUID = -4142534190418047933L;

	public NegativeValueException() {
		super("Try to do an operation with negative value");
	}
}
