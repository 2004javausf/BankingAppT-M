package com.revature.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.revarure.beans.Account;

public class FileStuff {
	public static final String accountFile = "accountList.txt";
	
	public static void writeAccountFile(List<Account> acctInfo) {
	try {
		ObjectOutputStream acctOut = new ObjectOutputStream(new FileOutputStream(accountFile));
		acctOut.writeObject(acctInfo);
		acctOut.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
	//read method will read data from a txt file and return a list
	
	public static void readAccountFile() {
		try {
			ObjectInputStream acctInfoIn = new ObjectInputStream(new FileInputStream(accountFile));
			Roster.accountInfoList= (ArrayList<Account>) acctInfoIn.readObject();
			acctInfoIn.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
