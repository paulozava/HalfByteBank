package BankingExeptions;

public class NotEnouthBalanceException extends BankingExeptions {

	private static final long serialVersionUID = 4609171917706945905L;

	public NotEnouthBalanceException() {
		super("Not enouth balance to do this operation");
	}
}
