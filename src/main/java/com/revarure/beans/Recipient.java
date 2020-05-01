package com.revarure.beans;

public class Recipient {
	private String name;
	private String email;
	private String phoneNumber;
	private String accountNumber;
	private User user;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	//Constructors
	public Recipient() {
		
	}
	public Recipient(String name, String email, String phoneNumber, String accountNumber, User user) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.accountNumber = accountNumber;
		this.user = user;
	}
	
	//toString Method
	@Override
	public String toString() {
		return "Recipient [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + ", accountNumber="
				+ accountNumber + ", user=" + user + "]";
	}
	
}
