package com.revarure.beans;

public abstract class BankUser {

	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private Long phoneNumber;
	private String email;
	private int id;
	protected String userType;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public BankUser() {
		super();
		this.id = GenerateID.getCurrentID();
	}

	public BankUser(String firstName, String middleName, String lastName, String address, Long phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.id = GenerateID.getCurrentID();
	}
	
	
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Long getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(Long phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


@Override
public String toString() {
	return "User [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", address="
			+ address + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
}
}