package com.revarure.beans;

import java.time.LocalDateTime;

public class Transaction {
	private String transactionId;
	private AccountTypes typeCode;
	private String transactionTypeName;
	private String fromAccountNo;
	private String toAccountNo;
	private String positiveAmount;//if sign of the amount is positive it decreases the from account(loses money) and increase the to account (gains money)
	private String negativeAmount;
	private LocalDateTime date;
	
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public AccountTypes getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(AccountTypes typeCode) {
		this.typeCode = typeCode;
	}
	public String getTransactionTypeName() {
		return transactionTypeName;
	}
	public void setTransactionTypeName(String transactionTypeName) {
		this.transactionTypeName = transactionTypeName;
	}
	public String getFromAccountNo() {
		return fromAccountNo;
	}
	public void setFromAccountNo(String fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}
	public String getToAccountNo() {
		return toAccountNo;
	}
	public void setToAccountNo(String toAccountNo) {
		this.toAccountNo = toAccountNo;
	}
	public String getPositiveAmount() {
		return positiveAmount;
	}
	public void setPositiveAmount(String positiveAmount) {
		this.positiveAmount = positiveAmount;
	}
	public String getNegativeAmount() {
		return negativeAmount;
	}
	public void setNegativeAmount(String negativeAmount) {
		this.negativeAmount = negativeAmount;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
}