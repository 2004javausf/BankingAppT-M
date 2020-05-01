package com.revarure.beans;

import java.io.Serializable;
import java.util.List;

import com.revature.service.Bank;

public class SavingsAccount extends Account implements Serializable {
	/**
	 * 
	 */
	//List of properties specific to savings account
	private static final long serialVersionUID = -7118565316272970449L;
	private String savingsAccountNumber;
	private static double savingsBalance;
	private List<Transaction> transactionList;
	
	//getters and Setters
	
	public static double getSavingsBalance() {
		return savingsBalance;
	}
	public static void setSavingsBalance(double savingsBalance) {
		SavingsAccount.savingsBalance = savingsBalance;
	}
	public List<Transaction> getTransactionList() {
		return transactionList;
	}
	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}
	
	//Constructors	
	public SavingsAccount(String username, String userType, String password, String sSN, String accountTypeName, double initDeposit) {
		super(username, userType, password, sSN, accountTypeName, initDeposit);
	
	}
	
	
	//toString Method
	
	@Override
	public String toString() {
		return "SavingsAccount [savingsAccountNumber=" + savingsAccountNumber + ", transactionList=" + transactionList + "]";
	}
}
