package com.revature.util;

import java.util.ArrayList;
import java.util.List;

import com.revarure.beans.AccountInfo;
import com.revature.menu.Menu;

public class Roster {
	public static List<AccountInfo> accountInfoList= 
			new ArrayList<AccountInfo>();

			
			public static AccountInfo findWarriorByName(String inputName) {
				for(int i=0;i<accountInfoList.size();i++) {
					String name=accountInfoList.get(i).getUsername();
					if(inputName.equals(name)) {
						return accountInfoList.get(i);
					}
				}
						System.out.println("Account Not Found");
						Menu.startMenu();
						return null;
			}
}
