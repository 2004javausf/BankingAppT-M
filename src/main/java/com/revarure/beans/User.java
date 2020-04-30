package com.revarure.beans;

import java.io.Serializable;
import java.util.ArrayList;

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
	private String maritalStatus;
	private boolean isAdmin;
	private boolean isEmployee;
	private ArrayList <Integer> id;
	
	public User() {
		super();
	}

	public User(String firstName, String middleName, String lastName, String address, Long phoneNumber, String email,
			String maritalStatus, boolean isAdmin, boolean isEmployee, ArrayList<Integer> id) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.maritalStatus = maritalStatus;
		this.isAdmin = isAdmin;
		this.isEmployee = isEmployee;
		this.id = id;
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
public String getMaritalStatus() {
	return maritalStatus;
}
public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}
public boolean isAdmin() {
	return isAdmin;
}
public void setAdmin(boolean isAdmin) {
	this.isAdmin = isAdmin;
}
public boolean isEmployee() {
	return isEmployee;
}
public void setEmployee(boolean isEmployee) {
	this.isEmployee = isEmployee;
}
public ArrayList<Integer> getId() {
	return id;
}
public void setId(ArrayList<Integer> id) {
	this.id = id;
}

@Override
public String toString() {
	return "User [firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", address="
			+ address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", maritalStatus=" + maritalStatus
			+ ", isAdmin=" + isAdmin + ", isEmployee=" + isEmployee + ", id=" + id + "]";
}

public void createUser() {
	
	
}
}
