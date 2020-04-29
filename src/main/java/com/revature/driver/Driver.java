package com.revature.driver;

import com.revature.menu.Menu;
import com.revature.util.FileStuff;
import com.revature.util.Roster;

public class Driver {

	public static void main(String[] args) {
		FileStuff.readAccountFile();
		System.out.println(Roster.accountInfoList.toString());
		System.out.println("===========");
		Menu.startMenu();

	}

}
