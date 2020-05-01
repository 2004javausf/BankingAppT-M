package com.revarure.beans;

import java.io.Serializable;

public class CheckingAccount extends Account implements Serializable{

	/**
	 * 
	 */
	//List of properties specific to Checking account
	private static final long serialVersionUID = 2899587853235765643L;
	private String debitCardNumber;
	private static double checkingBalance;
//	private int pinCode;
	
	
	//getters and setters
	public String getDebitCardNumber() {
		return debitCardNumber;
	}
	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}
	public static double getCheckingBalance() {
		return checkingBalance;
	}
	public static void setCheckingBalance(double checkingBalance) {
		CheckingAccount.checkingBalance = checkingBalance;
	}
//	public int getPinCode() {
//		return pinCode;
//	}
//	public void setPinCode(int pinCode) {
//		this.pinCode = pinCode;
//	}
	
	//Constructors
	public CheckingAccount(String username, String userType, String password, String sSN, String checkingAccountNumber, double initDeposit) {
		super(username, userType, password, sSN, checkingAccountNumber, initDeposit);
		this.checkingBalance=checkingBalance;
	}
	
	
	

}
