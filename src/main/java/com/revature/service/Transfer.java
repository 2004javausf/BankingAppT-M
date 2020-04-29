package com.revature.service;

import java.util.Scanner;

import com.revarure.beans.AccountInfo;

public class Transfer {
	public void transfer(AccountInfo a, AccountInfo b) {
		//transfer money from a to b
		long firstBalance = a.getBalance();
		long secondBalance = b.getBalance();
		Scanner s = new Scanner(System.in);
		long transferAmount = (s.nextLong());
		a.setBalance(firstBalance - transferAmount);
		b.setBalance(secondBalance + transferAmount);
		FileStuff.writeAccountFile(Roster.accountInfoList);
	}


}
