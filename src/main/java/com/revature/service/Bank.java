package com.revature.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.revarure.beans.Account;
import com.revarure.beans.Admin;
import com.revarure.beans.CheckingAccount;
import com.revarure.beans.Employee;
import com.revarure.beans.SavingsAccount;
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
			System.out.println("Date: " + Transaction.getDate() + "; To Account: " + t.getToAccountNo() + "; From Account: " + t.getAccount() + "; Amount: " + t.getAmount());
		}
	}
	
	//find account
	public static int findItemByAccountNumber(String accountNumber, ArrayList<Account> accounts){
		int index = 0;
	    for(Account account : accounts){
	        if(account.getAccountNumber() == Integer.valueOf(accountNumber)){
	            return index;
	        }
			index++;
	    }
	    System.out.println("This account does not exist.");
	    return -1;
	    }
	//make a deposit
	public void deposit(String accountNumber, double amount) {
		
		if (amount >= 0.00) {
				System.out.println("Deposit: $" + amount);
				Account account = Bank.accounts.get(findItemByAccountNumber(accountNumber, Bank.accounts));//returns 
		        amount = account.getBalance() + amount;
//		        transactions.add("Time: " + Transaction.getDate().toString() + " Deposit value: " + amount + " New balance: " + amount);
		        transactions.add(new Transaction("Deposit", account, amount, LocalDateTime.now()));
		        System.out.println("New balance: $" + amount + "\n"); 
		    }
		else {
			System.out.println("This transaction is invalid!");
		}
	}

	
	//transfer money between accounts
	public void transfer(Account a, Account b) {
		//transfer money from a to b
		double firstAmount = SavingsAccount.getSavingsBalance();
		double secondAmount = CheckingAccount.getCheckingBalance();
		
		Scanner s = new Scanner(System.in);
		
		double transferAmount = (s.nextLong());
		a.setBalance(firstAmount - transferAmount);
		b.setBalance(secondAmount + transferAmount);
		FileStuff.writeAccountFile(Roster.accountInfoList);
	}
	
	
	
	//make withdrawals
	public void withdraw(double amount)
    {
		int value = 0;
   
		if (amount >= 0.00 && amount <= Account.getBalance()) {
        double balance = Account.getBalance() - amount;
        balance = balance - amount;
        value++;
    }
		System.out.println("Withdrawing the amount: $" + amount);
    }
	
	//create an account
		void createAccount() {
			
		}
		
	
	//login information for customer and employee
		
		
		
		
		//view customer list
		//TODO: if account number starts with "CUS" generate customer list
		 public String getCustomer(){
		 return "Name: "+ Account.getUsername() +".";
		  }

			public String getAccountInfo() {
			String info = Account.getBalance() + "\n" + Integer.toString(Account.getAccountNumber()) + "\n" ;
			int i = 0;
			 while(i<accounts.size()) {
			   accounts.get(i);
			info += Account.getAccountTypeName() + "\n";
			   i++;
			}
			 return info;
			}

//public String getAccount() {
//   return "Account type: " + accountTypeName + ", Account number: " + accountNumber + ", Balance: " + balance;
//
		
		//create user account

		//login method
		
		//cancel customer account
		void deleteAccount() {
			
		}
		
		//approve or deny transaction
		
		
		//view customer application
	
    
}
