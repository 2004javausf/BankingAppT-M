package com.revarure.beans;

import java.io.Serializable;
import java.util.ArrayList;

public class AccountInfo extends User implements Serializable {
	
	private static final long serialVersionUID = 5206754926733442486L;
	private String username;
	private String password;
	private int accountId;
	private int pinCode;
	
	private ArrayList<AccountTypes> accounts;

	public ArrayList<AccountTypes> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<AccountTypes> accounts) {
		this.accounts = accounts;
	}

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
	
	public AccountInfo() {
		super();
	}
	public AccountInfo(String username, String password, int accountId, int pinCode,
			ArrayList<AccountTypes> accounts) {
		super();
		this.username = username;
		this.password = password;
		this.accountId = accountId;
		this.pinCode = pinCode;
		this.accounts = accounts;
	}
	
	
	 // This method adds an account to a customer
	   public void addAccounts(AccountTypes s) {
	     accounts.add(s);
	   }
	
	   public String getCustomer(){
		        return "Name: "+ username +".";
		      }
	   
	   public String getAccountInfo() {
	     String info = this.getCustomer() + "\n" ;
	     int i = 0;
	     while(i<accounts.size()) {
	       info += accounts.get(i).getAccountTypeName() + "\n";
	       i++;
	}
	     return info;
	   }

	   public String getAccount() {
		   return "Account type: " + AccountTypes.getAccountTypeName() + ", Account number: " + AccountTypes.getAccountTypeCode() + ", Balance: " + AccountTypes.getBalance();
		       }
}
