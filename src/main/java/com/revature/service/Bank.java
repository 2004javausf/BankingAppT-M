package com.revature.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.revarure.beans.Account;
import com.revarure.beans.Admin;
import com.revarure.beans.CheckingAccount;
import com.revarure.beans.Employee;
import com.revarure.beans.SavingsAccount;
import com.revarure.beans.Transaction;
import com.revarure.beans.User;
import com.revature.util.FileStuff;
import com.revature.util.Roster;


public abstract class Bank {
	private static ArrayList<User> users;
	private static ArrayList<Account> accounts;
	private static ArrayList<Employee> employees;
	private static ArrayList<Transaction> transactions;
	private static ArrayList<Admin> admin;
	private static Scanner userInput;
	
	//Getters and setters
	public static ArrayList<User> getUsers() {
		return users;
	}

	public static void setUsers(ArrayList<User> users) {
		Bank.users = users;
	}

	public static ArrayList<Account> getAccounts() {
		return accounts;
	}

	public static void setAccounts(ArrayList<Account> accounts) {
		Bank.accounts = accounts;
	}

	public static ArrayList<Employee> getEmployees() {
		return employees;
	}

	public static void setEmployees(ArrayList<Employee> employees) {
		Bank.employees = employees;
	}

	public static ArrayList<Transaction> getTransactions() {
		return transactions;
	}

	public static void setTransactions(ArrayList<Transaction> transactions) {
		Bank.transactions = transactions;
	}

	public static ArrayList<Admin> getAdmin() {
		return admin;
	}

	public static void setAdmin(ArrayList<Admin> admin) {
		Bank.admin = admin;
	}

	
	
	
	
	//view transaction history
	public static void completeAccountTransactionHistory(int accountNumber) {
		ArrayList<Transaction> accountTransactions = new ArrayList<>();
		for(Transaction transaction : transactions) {
			if((transaction.getTransactionTypeName().equals("Deposit")) || ((transaction.getTransactionTypeName().equals("Withdrawal")))) {
				if(Integer.valueOf(accountNumber) == transaction.getFromAccount()) {
					accountTransactions.add(transaction);
				}
			} else if (transaction.getTransactionTypeName().equals("Transfer")){
				if(Integer.valueOf(accountNumber) == transaction.getFromAccount() || Integer.valueOf(accountNumber) == transaction.getFromAccount()) {
					accountTransactions.add(transaction);
				}
			}
		}
			//printout of all transactions
		for(Transaction transaction : accountTransactions) {
			System.out.println("Date: " + transaction.getDate() + "\tTransaction Type: " + transaction.getTransactionTypeName() + "\tFrom Account: " + transaction.getFromAccount() +
					"\tTo Account: " + transaction.getToAccountNo() + "\tAmount: " + transaction.getAmount());
			System.out.println("Account Balance: " + findItemByAccountNumber(accountNumber, Bank.accounts));

		}
			
//			System.out.println("Date: " + Transaction.getDate() + "; To Account: " + t.getToAccountNo() + "; From Account: " + t.getAccount() + "; Amount: " + t.getAmount());
	}
	
	//find account
	public static int findItemByAccountNumber(int accountNumber, ArrayList<Account> accounts){
		int index = 0;
	    for(Account account : accounts){
	        if(account.getAccountNumber() == accountNumber){
	            return index;
	        }
			index++;
	    }
	    System.out.println("This account does not exist.");
	    return -1;
	    }
	
	
	//find user
		public static int findUserBySSNNumber(String sSN, ArrayList<User> users){
			int index = 0;
		    for(User user : users){
		        if(user.getsSN().equals(sSN)){
		            return index;
		        }
				index++;
		    }
		    System.out.println("This user does not exist.");
		    return -1;
		    }
		
	//find transaction
		public static int findTransactionByID(String transactionNumber){
			int index = 0;
		    for(Transaction transaction : transactions){
		        if(transaction.getTransactionNumber() == Integer.valueOf(transactionNumber)){
		            return index;
		        }
				index++;
		    }
		    System.out.println("This transaction does not exist.");
		    return -1;
		    }
	
	
	
	
	//make a deposit
	public void deposit(int accountNumber, double amount) {
		
		if (amount >= 0.00) {
				System.out.println("Deposit: $" + amount);
				Account account = Bank.accounts.get(findItemByAccountNumber(accountNumber, Bank.accounts));//returns 
		        amount = account.getBalance() + amount;
//		        transactions.add("Time: " + Transaction.getDate().toString() + " Deposit value: " + amount + " New balance: " + amount);
		        account.setBalance(account.getBalance() + amount);
		        transactions.add(new Transaction("Deposit", account.getAccountNumber(), account.getAccountNumber(), amount, LocalDateTime.now()));
		        System.out.println("New balance: $" + amount + "\n"); 
		    }
		else {
			System.out.println("This transaction is invalid!");
		}
	}

	
	//transfer money between accounts
	public void transfer(int fromAccountNumber, int toAccountNumber, double amount) {
		//transfer money from a to ba
		System.out.println("Transfer amount of " + amount + " from account: " + fromAccountNumber + " to account: " + toAccountNumber);
		Account fromAccount = Bank.accounts.get(findItemByAccountNumber(fromAccountNumber, Bank.accounts));
		Account toAccount = Bank.accounts.get(findItemByAccountNumber(toAccountNumber, Bank.accounts));
		fromAccount.setBalance(fromAccount.getBalance() - amount)  ;
		toAccount.setBalance(fromAccount.getBalance() + amount) ;
        transactions.add(new Transaction("Transfer", fromAccount.getAccountNumber(), toAccount.getAccountNumber(), amount, LocalDateTime.now()));
        System.out.println("Transfer of $" + amount + "from account " + fromAccountNumber + " to account " + toAccountNumber + " successful.");
        System.out.println("Account balances: ");
        System.out.println("Account (From) " + fromAccountNumber + " Balance: $" + fromAccount.getBalance());
        System.out.println("Account (To) " + toAccountNumber + " Balance: $" + toAccount.getBalance());
//		double firstAmount = SavingsAccount.getSavingsBalance();
//		double secondAmount = CheckingAccount.getCheckingBalance();
//		
//		Scanner s = new Scanner(System.in);
//		
//		double transferAmount = (s.nextLong());
//		a.setBalance(firstAmount - transferAmount);
//		b.setBalance(secondAmount + transferAmount);
//		FileStuff.writeAccountFile(Roster.accountInfoList);
	}
	
	
	
	//make withdrawals
//	public void withdraw(double amount)
//    {
//		int value = 0;
//   
//		if (amount >= 0.00 && amount <= Account.getBalance()) {
//        double balance = Account.getBalance() - amount;
//        balance = balance - amount;
//        value++;
//    }
//		System.out.println("Withdrawing the amount: $" + amount);
//    }
public void withdrawal(int accountNumber, double amount) {
		
		if (amount >= 0.00 && amount <= Bank.accounts.get(findItemByAccountNumber(accountNumber, Bank.accounts)).getBalance()) {
				System.out.println("Withdrawal: $" + amount);
				Account account = Bank.accounts.get(findItemByAccountNumber(accountNumber, Bank.accounts));//returns 
//		        transactions.add("Time: " + Transaction.getDate().toString() + " Deposit value: " + amount + " New balance: " + amount);
		        account.setBalance(account.getBalance() - amount);
		        transactions.add(new Transaction("Withdrawal", account.getAccountNumber(), account.getAccountNumber(), amount, LocalDateTime.now()));
		        System.out.println("New balance: $" + amount + "\n"); 
		    }
		else {
			System.out.println("This transaction is invalid!");
		}
	}
	
	//create an account
		void createAccount() {
			
			System.out.println("Please enter your name: ");
			String username = userInput.nextLine();
			System.out.println("Please enter your userType: ");
			String userType = userInput.nextLine();
			System.out.println("Please enter your password: ");
			String password = userInput.nextLine();
			System.out.println("Please enter your social security number: ");
			String sSN = userInput.nextLine();
			System.out.println("Please enter your initial deposit: ");
			double initDeposit = Double.valueOf(userInput.nextLine());
			System.out.println("Please enter your account type (Checking or Savings): ");
			String accountTypeName = userInput.nextLine();
			
			switch(accountTypeName) {
			case "Checking":
				accounts.add(new CheckingAccount(username, userType, password, sSN, accountTypeName, initDeposit));
				break;
			case "Savings":
				accounts.add(new SavingsAccount(username, userType, password, sSN, accountTypeName, initDeposit));
				break;
			default:
				break;
			}
			
			System.out.println("Account created successfully!");
	
		}
		
	
	//login information for customer and employee
		
		
		
		
//		//view customer list
//		//TODO: if account number starts with "CUS" generate customer list
//		 public String getCustomer(){
//		 return "Name: "+ Account.getUsername() +".";
//		  }
//
//			public String getAccountInfo() {
//			String info = Account.getBalance() + "\n" + Integer.toString(Account.getAccountNumber()) + "\n" ;
//			int i = 0;
//			 while(i<accounts.size()) {
//			   accounts.get(i);
//			info += Account.getAccountTypeName() + "\n";
//			   i++;
//			}
//			 return info;
//			}

//public String getAccount() {
//   return "Account type: " + accountTypeName + ", Account number: " + accountNumber + ", Balance: " + balance;
//
		

		//login method
		
		//cancel customer account
		void deleteAccount(int accountNumber) {
			if(Bank.findItemByAccountNumber(accountNumber, accounts) > -1) {
				accounts.remove(Bank.findItemByAccountNumber(accountNumber, accounts));
				System.out.println("Successfully deleted account: " + accountNumber);
			}
			
			System.out.println("Account not found. No accounts deleted.");
		}
		
		//approve or deny transaction
		
		
		//view customer application
	
    
}
