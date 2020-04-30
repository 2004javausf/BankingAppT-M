package com.revature.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.revarure.beans.Account;
import com.revarure.beans.Admin;
import com.revarure.beans.Employee;
import com.revarure.beans.Transaction;
import com.revature.util.FileStuff;
import com.revature.util.Roster;


public abstract class Bank {
	private static ArrayList<Account> accounts;
	private static ArrayList<Employee> employees;
	private static ArrayList<Transaction> transactions;
	private static ArrayList<Admin> admin;
	
	
	//view transaction history
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
	public void transfer(Account a, Account b) {
		//transfer money from a to b
		double firstBalance = a.getBalance();
		double secondBalance = b.getBalance();
		
		Scanner s = new Scanner(System.in);
		
		long transferAmount = (s.nextLong());
		a.setBalance(firstBalance - transferAmount);
		b.setBalance(secondBalance + transferAmount);
		FileStuff.writeAccountFile(Roster.accountInfoList);
	}
	
	//view customer information
	public void readCustomerInfo() {
		
	}
	
	
	//make withdrawals
	public void withdraw(double amount)
    {
		int time = 0;
   
		if (amount >= 0.00 && amount <= Account.getBalance()) {
        double balance = Account.getBalance() - amount;
        balance = balance - amount;
        time++;
    }
    }
	
	//create an account
		void createAccount() {
			
		}
		
	
	//login information for customer and employee
		
		//view customer application
		
		//view customer list
		
		//create user account

		//login method
		
		//cancel customer account
		void deleteAccount() {
			
		}
		
		//approve or deny transaction
	
    
}
