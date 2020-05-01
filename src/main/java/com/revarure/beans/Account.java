package com.revarure.beans;

import java.io.Serializable;
import java.util.List;

import com.revature.service.Bank;

public class Account extends User implements Serializable {
	//List of common properties for savings and checking account
	private static final long serialVersionUID = 5206754926733442486L;
	private String username;
	private String password;
	protected int accountNumber;
	private double balance;
	private String accountTypeName;
	private List<Transaction> transactionList;
	


	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

	//getters and setters

	public String getUsername() {
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
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountId) {
		this.accountNumber = accountId;
	}
	
	public String getAccountTypeName() {
		return accountTypeName;
	}
	public void setAccountTypeName(String accountTypeName) {
		this.accountTypeName = accountTypeName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
		
	public Account(String username, String userType, String password, String sSN, String accountTypeName, double initDeposit) {
		this.username = username;
		this.password=password;
		this.accountNumber = GenerateID.getCurrentID(Bank.getUsers().get(Bank.findUserBySSNNumber(sSN, Bank.getUsers())).getsSN());
		this.userType = userType;
		this.accountTypeName = accountTypeName;
		this.balance=initDeposit;
	}
	
	@Override
	public String toString() {
		return "Account [username=" + username + ", accountNumber=" + accountNumber + "balance= " + balance + ", transactionList=" + transactionList + "]";
	}
}
