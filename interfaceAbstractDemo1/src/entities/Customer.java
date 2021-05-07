package entities;

import java.util.Date;

public class Customer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private Date dataOfBirth;
	
	
	public Customer(int id, String firstName, String lastName, String nationalityId, Date dataOfBirth) {
		super();
		this.id = id;
		this.dataOfBirth = dataOfBirth;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


	public Date getDataOfBirth() {
		return dataOfBirth;
	}


	public void setDataOfBirth(Date dataOfBirth) {
		this.dataOfBirth = dataOfBirth;
	}
}
