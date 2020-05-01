package com.revature.menu;

import java.util.ArrayList;
import java.util.Scanner;

import com.revarure.beans.Account;
import com.revature.dao.AccountInfoDaoImpl;
import com.revature.service.Bank;

public class Menu {
	
	static Scanner userInput = new Scanner(System.in);

	public static void startMenu(){
		System.out.println("Please choose your user type:");
		System.out.println("[1] Customer");
		System.out.println("[2] Employee");
		System.out.println("[3] Admin");
	
	int userEntry = userInput.nextInt();
	
	
	switch(userEntry) {
	case 1:
		//customer method
		System.out.println("[1] register");
		System.out.println("[2] login");
		userEntry = userInput.nextInt();
		switch(userEntry) {
		case 1:
			AccountInfoDaoImpl register = new AccountInfoDaoImpl();
			String username = userInput.next();
			String password = userInput.next();
			Account accountinfo = new Account(username, password, null, 0, null, 0 );
			register.register(accountinfo);
			System.exit(0);
		case 2:
			AccountInfoDaoImpl login = new AccountInfoDaoImpl();
			System.out.println("Enter username");
			String username1 = userInput.nextLine();
			System.out.println("Enter password");
			String password1 = userInput.nextLine();
			Boolean flag = login.isLogin(username1, password1);
			if (flag = true) {
				System.out.println("[1] deposit");
				System.out.println("[2] withdraw");
				System.out.println("[3] transfer");
				userEntry = userInput.nextInt();
				Bank a = new Bank();
				switch(userEntry) {
				case 1:
					int amount1 = userInput.nextInt();
					a.deposit(accountNumber, amount1);
					break;
				case 2:
					int amount2 = userInput.nextInt(); 
					a.withdrawal(accountNumber, amount2);
					break;
				case 3:
					int amount3 = userInput.nextInt();
					a.transfer(fromAccountNumber, toAccountNumber, amount3);
					break;
				default:
					System.out.println("Invalid input. Please try again");
					break;
				}	
			}
		default:
			System.out.println("Invalid input. Please try again");
			break;
		}
		
	case 2:
		//employee method
		break;
	case 3:
		//admin method
		break;
	default:
		System.out.println("Invalid input. Please try again");
		//reroute to main menu
		break;
	
	}
	System.out.println("Thank you and have a great day!");
	
		
	}
	
	
		
	}


