package Client;

import java.util.Date;
import java.util.List;

import Milliceavous.IdCode;

public class Client {

	private long id;
	private int fiscalCode;
	private String name;
	private String personType;
	private Date birthdate;
	private List<Phone> phoneNumbers;
	private Adress adress;
	private boolean incompleteOpening = false;
	
	public Client(int fiscalCode, String name, String personType, Date birthdate, Adress adress) {
		this.id = new IdCode().getId();
		this.fiscalCode = fiscalCode;
		this.name = name;
		this.personType = personType;
		this.birthdate = birthdate;
		this.adress = new Adress();
	}
	
	public Client(int fiscalCode, String name, String personType) {
		this.id = new IdCode().getId();
		this.fiscalCode = fiscalCode;
		this.name = name;
		this.personType = personType;
		this.incompleteOpening = true;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public boolean isIncompleteOpening() {
		return incompleteOpening;
	}

	public void setIncompleteOpening(boolean incompleteOpening) {
		this.incompleteOpening = incompleteOpening;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Phone> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<Phone> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public long getId() {
		return id;
	}

	public int getFiscalCode() {
		return fiscalCode;
	}

	public String getPersonType() {
		return personType;
	}

	public Adress getAdress() {
		return adress;
	}
}
