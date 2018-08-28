package halfbytebank.bank.Account;

import halfbytebank.bank.Milliceavous.NumberValuation;
import halfbytebank.bank.exeptions.BankingExeptions.NegativeValueException;
import halfbytebank.bank.exeptions.BankingExeptions.NotEnouthBalanceException;

abstract class BasicAccount {

	private int accountNumber;
	private int verificationOfNumber;	
	private int bankAgency;
	private int verificationOfAgency;
	private double balance;
	
	public boolean withdraw(double value){
		if (value <= 0) {
			throw new NegativeValueException();
		} else if(this.getBalance() < value) {
			throw new NotEnouthBalanceException();
		}
		this.balance -= value;
		return true;
	}
	
	public boolean deposit(double value){
		if (value <= 0) {
			throw new NegativeValueException();
		}
		this.balance += value;
		return true;
	}

	public boolean transfer(double value, BasicAccount target) {
		try {
			this.withdraw(value);
			target.deposit(value);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}
	
	protected double getBalance() {
		return balance;
	}

	protected int getAccountNumber() {
		return accountNumber;
	}

	protected int getBankAgency() {
		return bankAgency;
	}

	protected int getVerificationOfNumber() {
		return verificationOfNumber;
	}

	protected int getVerificationOfAgency() {
		return verificationOfAgency;
	}

	protected void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	protected void setVerificationOfNumber(int accountNumber) {
		this.verificationOfNumber = new NumberValuation(accountNumber).generate();
	}

	protected void setBankAgency(int bankAgency) {
		this.bankAgency = bankAgency;
	}

	protected void setVerificationOfAgency(int bankAgency) {
		this.verificationOfAgency = new NumberValuation(bankAgency).generate();
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}
}
