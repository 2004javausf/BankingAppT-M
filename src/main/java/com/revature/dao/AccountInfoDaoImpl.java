package com.revature.dao;

import java.util.ArrayList;

import com.revarure.beans.Account;

public class AccountInfoDaoImpl implements AccountInfoDao{
	//create an arrayList to hold AccountInfo  
	static ArrayList<Account> accountinfos = new ArrayList<Account>();

	@Override
	public void register(Account accountinfo) {
		// TODO Auto-generated method stub
		accountinfos.add(accountinfo);
	}

	@Override
	public boolean isLogin(String username, String password) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(Account accountinfo : accountinfos) {
			if (username.equals(accountinfo.getUsername())&&password.equals(accountinfo.getPassword())) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}
