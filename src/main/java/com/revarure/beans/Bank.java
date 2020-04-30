package com.revarure.beans;

import java.util.ArrayList;

public class Bank {
	private static ArrayList<Account> accounts;
	private static ArrayList<Employee> employees;
	private static ArrayList<Transaction> transactions;
	private static ArrayList<Admin> admin;
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	public ArrayList<Admin> getAdmin() {
		return admin;
	}
	public void setAdmin(ArrayList<Admin> admin) {
		this.admin = admin;
	}

	//get transaction history
	public static void completeTransactionHistory() {
		for(Transaction t: transactions) {
			System.out.println("Date: " + t.getDate() + "; To Account: " + t.getToAccountNo() + "; From Account: " + t.getFromAccountNo() + "; Amount: " + t.getPositiveAmount());
		}
	}
	
	//make a deposit
	public void deposit(double value) {
		int time = 0;
		if (value >= 0.00) {
		        value = Account.getBalance() + value;
		        System.out.println("Deposit: " + value);
		        transactions.add("Time: " + Transaction.getDate().toString() + " Deposit value: " + value + " New balance: " + value);
		        System.out.println("New balance: " + value + "\n");
		        time++;
		    }
	}

	
	//transfer money between accounts
	
	//make withdrawals
	public void withdraw(double amount)
    {
		int time = 0;
   
		if (amount >= 0.00 && amount <= balance) {
        double balance = Account.getBalance() - amount;
        balance = balance - amount;
        time++;
    }
    }
	
    
}
