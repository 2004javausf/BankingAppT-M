package com.revarure.beans;

import java.io.Serializable;

public class Account extends User implements Serializable {
	
	private static final long serialVersionUID = 5206754926733442486L;
	private String username;
	private int accountId;
	private int pinCode;
	private static double balance;
	private static String accountTypeName;
	


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
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
	
	public Account() {
		super();
		this.accountId = GenerateID.getCurrentID();
		this.userType = "CUS";
	}
	public Account(String username, String password, int accountId, int pinCode, String accountTypeName, double balance) {
		super();
		this.username = username;
		this.accountId = accountId;
		this.pinCode = pinCode;
		this.userType = "CUS";
		this.accountTypeName = accountTypeName;
		this.balance=balance;
	}
	
	
	   public String getCustomer(){
		        return "Name: "+ username +".";
		      }
	   
//	   public String getAccountInfo() {
//	     String info = this.getCustomer() + "\n" ;
//	     int i = 0;
//	     while(i<accounts.size()) {
//	       info += accounts.get(i).getAccountTypeName() + "\n";
//	       i++;
//	}
//	     return info;
//	   }

	   public String getAccount() {
		   return "Account type: " + accountTypeName + ", Account number: " + accountId + ", Balance: " + balance;
		       }
}
