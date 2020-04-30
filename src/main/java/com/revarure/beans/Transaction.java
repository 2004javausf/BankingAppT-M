package com.revarure.beans;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9180744069953356784L;
	private static int transactionId = 0;
	private String transactionTypeName;
	private int fromAccountNo;
	private int toAccountNo;
	private int positiveAmount;//if sign of the amount is positive it increases the from account(loses money) and decreases the to account (gains money) while a negative decreases the from account and increases the to account
	private int negativeAmount;
	private static LocalDateTime date;
	
	public Transaction() {
		super();
	}
	
	public Transaction(int transactionId, String transactionTypeName, int fromAccountNo,
			int toAccountNo, int positiveAmount, int negativeAmount, LocalDateTime date) {
		super();
		Transaction.transactionId = transactionId;
		this.transactionTypeName = transactionTypeName;
		this.fromAccountNo = fromAccountNo;
		this.toAccountNo = toAccountNo;
		this.positiveAmount = positiveAmount;
		this.negativeAmount = negativeAmount;
		this.date = date;
	}
	
	
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionTypeName() {
		return transactionTypeName;
	}
	public void setTransactionTypeName(String transactionTypeName) {
		this.transactionTypeName = transactionTypeName;
	}
	public int getFromAccountNo() {
		return fromAccountNo;
	}
	public void setFromAccountNo(int fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}
	public int getToAccountNo() {
		return toAccountNo;
	}
	public void setToAccountNo(int toAccountNo) {
		this.toAccountNo = toAccountNo;
	}
	public int getPositiveAmount() {
		return positiveAmount;
	}
	public void setPositiveAmount(int positiveAmount) {
		this.positiveAmount = positiveAmount;
	}
	public int getNegativeAmount() {
		return negativeAmount;
	}
	public void setNegativeAmount(int negativeAmount) {
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
		return "Transaction [transactionId=" + transactionId + ", transactionTypeName="
				+ transactionTypeName + ", fromAccountNo=" + fromAccountNo + ", toAccountNo=" + toAccountNo
				+ ", positiveAmount=" + positiveAmount + ", negativeAmount=" + negativeAmount + ", date=" + date + "]";
	}
	
}