package halfbytebank.bank.Account;

/**
 * Account for an physical person
 * @author Paulo Zava
 * @version 0.1
 */

public class PhysicalPerson extends BasicAccount{

	public PhysicalPerson(int accountNumber, int bankAgency) {
		this.setAccountNumber(accountNumber); 
		this.setVerificationOfNumber(accountNumber); 
		this.setBankAgency(bankAgency);
		this.setVerificationOfAgency(bankAgency);
		this.setBalance(0.0);
	}
	
	public double printBalance() {
		return this.getBalance();
	}
}
