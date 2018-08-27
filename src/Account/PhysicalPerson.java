package Account;

public class PhysicalPerson extends BasicAccount{

	
	
	public PhysicalPerson(int accountNumber, int bankAgency) {
		this.setAccountNumber(accountNumber); 
		this.setVerificationOfNumber(accountNumber); 
		this.setBankAgency(bankAgency);
		this.setVerificationOfAgency(bankAgency);
		this.setBalance(0.0);

	}
}
