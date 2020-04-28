package com.revarure.beans;

public class AccountInfo extends User {
	private String username;
	private String password;
	private long accountId;
	private int pinCode;
	private long balance;
	/*
	public String getUsername() {
		return username;
	}
	*/
	public void setUsername(String username) {
		this.username = username;
	}
	/*
	public String getPassword() {
		return password;
	}
	*/
	public void setPassword(String password) {
		this.password = password;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
}
