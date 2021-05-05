package Entities;

import Abstracts.IEntity;

public class User implements IEntity{

	private int id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	
	public User(int id, String firstName, String lastName, String dateOfBirth) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
}
