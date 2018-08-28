package halfbytebank.bank.Tests;

import halfbytebank.bank.Account.PhysicalPerson;

public class Teste{
	public static void main(String[] args) throws Exception {
		PhysicalPerson c1 = new PhysicalPerson(1, 1);
		PhysicalPerson c2 = new PhysicalPerson(2, 1);
		c1.deposit(1200.0);
		c2.deposit(100.0);
		
		c1.transfer(200.0, c2);
		
		System.out.println(c1.printBalance());
		System.out.println(c2.printBalance());
	}
}
