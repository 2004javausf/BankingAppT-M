package com.revature.service;

import java.util.Scanner;

import com.revarure.beans.AccountInfo;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Transfer {
	public void transfer(AccountInfo a, AccountInfo b) {
		//transfer money from a to b
		int firstBalance = (int) a.getBalance();
		int secondBalance = (int) b.getBalance();
		Scanner s = new Scanner(System.in);
		long transferAmount = (s.nextLong());
		a.setBalance(firstBalance - transferAmount);
		b.setBalance(secondBalance + transferAmount);
		FileStuff.writeAccountFile(Roster.accountInfoList);
	}


}
