package com.revarure.beans;

import java.io.Serializable;

public abstract class AccountTypes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7459542892781787387L;
	private static String accountTypeCode;
	private static String accountTypeName;
	private static double balance;
	
	public AccountTypes() {
		super();
	}
	
	public AccountTypes(String accountTypeCode, String accountTypeName, double balance) {
		super();
		this.accountTypeCode = accountTypeCode;
		this.accountTypeName = accountTypeName;
		this.balance=balance;
		
	}
	
	public static String getAccountTypeCode() {
		return accountTypeCode;
	}
	public void setAccountTypeCode(String accountTypeCode) {
		this.accountTypeCode = accountTypeCode;
	}
	public static String getAccountTypeName() {
		return accountTypeName;
	}
	public void setAccountTypeName(String accountTypeName) {
		this.accountTypeName = accountTypeName;
	}
	public static double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountTypes [accountTypeCode=" + accountTypeCode + ", accountTypeName=" + accountTypeName + ", balance=" +
				balance +"]";
	}
}
