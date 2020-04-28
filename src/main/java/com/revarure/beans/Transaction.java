package com.revarure.beans;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9180744069953356784L;
	private String transactionId;
	private AccountTypes typeCode;
	private String transactionTypeName;
	private String fromAccountNo;
	private String toAccountNo;
	private String positiveAmount;//if sign of the amount is positive it decreases the from account(loses money) and increase the to account (gains money)
	private String negativeAmount;
	private LocalDateTime date;
	
	public Transaction() {
		super();
	}
	
	public Transaction(String transactionId, AccountTypes typeCode, String transactionTypeName, String fromAccountNo,
			String toAccountNo, String positiveAmount, String negativeAmount, LocalDateTime date) {
		super();
		this.transactionId = transactionId;
		this.typeCode = typeCode;
		this.transactionTypeName = transactionTypeName;
		this.fromAccountNo = fromAccountNo;
		this.toAccountNo = toAccountNo;
		this.positiveAmount = positiveAmount;
		this.negativeAmount = negativeAmount;
		this.date = date;
	}
	
	
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
	
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", typeCode=" + typeCode + ", transactionTypeName="
				+ transactionTypeName + ", fromAccountNo=" + fromAccountNo + ", toAccountNo=" + toAccountNo
				+ ", positiveAmount=" + positiveAmount + ", negativeAmount=" + negativeAmount + ", date=" + date + "]";
	}
	
}