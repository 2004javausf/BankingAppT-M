package com.revarure.beans;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import com.revature.service.Bank;

public class Transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9180744069953356784L;
	private int transactionNumber = 0;
	private String transactionTypeName;
	private int fromAccountNo;
	private int toAccountNo;
	private double amount;
	private LocalDateTime date;
	private User transactionUser;
	
	public Transaction() {
	}
	
	
	public Transaction(String transactionTypeName, int fromaAccount, int toAccountNo,
			double amount, LocalDateTime date) {
		this.transactionNumber = GenerateID.getCurrentID(transactionUser.getsSN());
		this.transactionTypeName = transactionTypeName;
		this.fromAccountNo = fromAccountNo;
		this.toAccountNo = toAccountNo;
		this.amount = amount;
		this.date = date;
	}
	
	
	
	public int getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getTransactionTypeName() {
		return transactionTypeName;
	}
	public void setTransactionTypeName(String transactionTypeName) {
		this.transactionTypeName = transactionTypeName;
	}
	public int getFromAccount() {
		return fromAccountNo;
	}
	public void setAccount(int fromAccountNo) {
		this.fromAccountNo = fromAccountNo;
	}
	public int getToAccountNo() {
		return toAccountNo;
	}
	public void setToAccountNo(int toAccountNo) {
		this.toAccountNo = toAccountNo;
	}
	
	public  double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public LocalDateTime getDate() {
		return date;
	}
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Transaction [transactionNumber=" + transactionNumber + ", transactionTypeName="
				+ transactionTypeName + ", fromAccountNo=" + fromAccountNo + ", toAccountNo=" + toAccountNo
				+ ", amount=" + amount + ", date=" + date + "]";
	}
	
}