package com.revature.service;

import java.util.Scanner;

import com.revarure.beans.Account;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Transfer {
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


}
