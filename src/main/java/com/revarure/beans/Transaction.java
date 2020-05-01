package com.revarure.beans;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

public class Transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -9180744069953356784L;
	private static int transactionNumber = 0;
	private String transactionTypeName;
	private Account account;
	private int toAccountNo;
	private static double amount;
	private static double availableBalance;
	private static Date date;
	
	public Transaction() {
		super();
	}
	
	public Transaction(int transactionNumber, String transactionTypeName, Account account,
			int toAccountNo, double amount, double availableBalance, Date date) {
		super();
		this.transactionNumber = transactionNumber;
		this.transactionTypeName = transactionTypeName;
		this.account = account;
		this.toAccountNo = toAccountNo;
		this.amount = amount;
		this.availableBalance = availableBalance;
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
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public int getToAccountNo() {
		return toAccountNo;
	}
	public void setToAccountNo(int toAccountNo) {
		this.toAccountNo = toAccountNo;
	}
	public static double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public static double getAvailableBalance() {
		return availableBalance;
	}
	public void setNegativeAmount(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	public static Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Transaction [transactionNumber=" + transactionNumber + ", transactionTypeName="
				+ transactionTypeName + ", account=" + account + ", toAccountNo=" + toAccountNo
				+ ", amount=" + amount + ", availableBalance=" + availableBalance + ", date=" + date + "]";
	}
	
}