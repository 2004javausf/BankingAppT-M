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
	public CheckingAccount() {
		super();
	}
	
	public CheckingAccount(String debitCardNumber, double checkingBalance) {
		super();
		this.debitCardNumber = "4" + accountNumber;//creating debit number starting with 4
		this.checkingBalance=checkingBalance;
//		this.pinCode = pinCode;
	}
	
	public CheckingAccount(String name, String sSN, String debitCardNumber, double checkingBalance, double initDeposit) {
		super();
		this.debitCardNumber = "4" + accountNumber;
		this.checkingBalance=checkingBalance;
//		this.pinCode = pinCode;
	}

}
