package com.revarure.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6786710939184748372L;
	private String firstName;
	private String middleName;
	private String lastName;
	private String address;
	private Long phoneNumber;
	private String email;
	private int id;
	protected String userType;
	
	private boolean enabled = true;
	


	private Account primaryAccount;
	private SavingsAccount savingsAccount;
	private List<Recipient> recipientList;
	
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

	public User() {
		super();
		this.id = GenerateID.getCurrentID();
	}

	public User(String firstName, String middleName, String lastName, String address, Long phoneNumber, String email,
			int id, String userType, boolean enabled, Account primaryAccount, SavingsAccount savingsAccount,
			List<Recipient> recipientList) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.id = id;
		this.userType = userType;
		this.enabled = enabled;
		this.primaryAccount = primaryAccount;
		this.savingsAccount = savingsAccount;
		this.recipientList = recipientList;
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

public boolean isEnabled() {
	return enabled;
}

public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}

public Account getPrimaryAccount() {
	return primaryAccount;
}

public void setPrimaryAccount(Account primaryAccount) {
	this.primaryAccount = primaryAccount;
}

public SavingsAccount getSavingsAccount() {
	return savingsAccount;
}

public void setSavingsAccount(SavingsAccount savingsAccount) {
	this.savingsAccount = savingsAccount;
}

public List<Recipient> getRecipientList() {
	return recipientList;
}

public void setRecipientList(List<Recipient> recipientList) {
	this.recipientList = recipientList;
}

@Override
public String toString() {
	return "User [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", address="
			+ address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", id=" + id + ", userType="
			+ userType + ", enabled=" + enabled + "]";
}




}