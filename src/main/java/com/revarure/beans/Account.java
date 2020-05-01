package com.revarure.beans;

import java.io.Serializable;
import java.util.List;

public class Account extends User implements Serializable {
	//List of common properties for savings and checking account
	private static final long serialVersionUID = 5206754926733442486L;
	private static String username;
	private String password;
	private static String sSN;
	protected static int accountNumber;
	private static double balance;
	private static String accountTypeName;
	private List<Transaction> transactionList;
	


	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

	//getters and setters

	public static String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static int getAccountNumber() {
		return accountNumber;
	}
	public static String getsSN() {
		return sSN;
	}

	public void setsSN(String sSN) {
		Account.sSN = sSN;
	}
	public void setAccountNumber(int accountId) {
		this.accountNumber = accountId;
	}
	
	public static String getAccountTypeName() {
		return accountTypeName;
	}
	public void setAccountTypeName(String accountTypeName) {
		Account.accountTypeName = accountTypeName;
	}
	public static double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		Account.balance = balance;
	}
	
	public Account() {
		super();
		this.accountNumber = GenerateID.getCurrentID();
		this.userType = "CUS";
	}
	public Account(String username, String password, String sSN, int accountId, String accountTypeName, double initDeposit) {
		super();
		this.username = username;
		this.password=password;
		Account.sSN=sSN;
		this.accountNumber = GenerateID.getCurrentID();
		this.userType = "CUS";
		Account.accountTypeName = accountTypeName;
		Account.balance=initDeposit;
	}
	
	@Override
	public String toString() {
		return "Account [username=" + username + ", accountNumber=" + accountNumber + "SSN=" + sSN + "balance= " + balance + ", transactionList=" + transactionList + "]";
	}
}
