package com.revature.menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	static Scanner userInput = new Scanner(System.in);
	static int userChoice;
//	ArrayList <String> arrayChoice = new ArrayList<>();

	public static void startMenu(){
		
	System.out.println("[1] Customer");
	System.out.println("[2] Employee");
	
	int userEntry = userInput.nextInt();
	
	
	switch(userEntry) {
	case 1:
		//customer method
		break;
	case 2:
		//employee method
		break;
	default:
		System.out.println("I'm sorry you aren't allowed access. Please try again");
		//reroute to main menu
		break;
	
	}
	System.out.println("Thank you and have a great day!");
	
		
	}
	
	public void custPortalEntry() {
		System.out.println("Please enter your account number: ");
		System.out.println("Please enter your pin number: ");
		
		

        System.out.println("2. Withdraw money");

        System.out.println("3. Transfer money");

        System.out.print("4. Joint Account");
        System.out.print("5. Exit");
        Scanner 

        userChoice = Integer.nextInt(userChoice);

        switch (userChoice) {

        case 1:

              // deposit money

              break;

        case 2:

              // withdraw money

              break;

        case 3:

              // check balance

              break;

        case 0:

              quit = true;

              break;

        default:

              System.out.println("Wrong choice.");

              break;

        }
		
	}

}
