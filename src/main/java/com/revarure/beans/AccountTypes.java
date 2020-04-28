package com.revarure.beans;

import java.io.Serializable;

public abstract class AccountTypes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7459542892781787387L;
	private String accountTypeCode;
	private String accountTypeName;
	
	public AccountTypes() {
		super();
	}
	
	public AccountTypes(String accountTypeCode, String accountTypeName) {
		super();
		this.accountTypeCode = accountTypeCode;
		this.accountTypeName = accountTypeName;
	}
	
	public String getAccountTypeCode() {
		return accountTypeCode;
	}
	public void setAccountTypeCode(String accountTypeCode) {
		this.accountTypeCode = accountTypeCode;
	}
	public String getAccountTypeName() {
		return accountTypeName;
	}
	public void setAccountTypeName(String accountTypeName) {
		this.accountTypeName = accountTypeName;
	}

	@Override
	public String toString() {
		return "AccountTypes [accountTypeCode=" + accountTypeCode + ", accountTypeName=" + accountTypeName
				+"]";
	}
}
