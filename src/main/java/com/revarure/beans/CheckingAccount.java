package com.revarure.beans;

import java.io.Serializable;

import com.revature.service.Bank;

public class CheckingAccount extends Account implements Serializable{

	/**
	 * 
	 */
	//List of properties specific to Checking account
	private static final long serialVersionUID = 2899587853235765643L;
	private String debitCardNumber;
//	private int pinCode;
	
	
	//getters and setters
	public String getDebitCardNumber() {
		return debitCardNumber;
	}
	public void setDebitCardNumber(String debitCardNumber) {
		this.debitCardNumber = debitCardNumber;
	}
	
//	public int getPinCode() {
//		return pinCode;
//	}
//	public void setPinCode(int pinCode) {
//		this.pinCode = pinCode;
//	}
	
	//Constructors
	
	
	public CheckingAccount(String username, String userType, String password, String sSN, String accountTypeName, double initDeposit) {
		super(username, userType, password, sSN, accountTypeName, initDeposit);
	}
	
	
	

}
