package com.revature.dao;

import java.util.ArrayList;

import com.revarure.beans.AccountInfo;

public class AccountInfoDaoImpl implements AccountInfoDao{
	//create an arrayList to hold AccountInfo  
	static ArrayList<AccountInfo> accountinfos = new ArrayList<AccountInfo>();

	@Override
	public void register(AccountInfo accountinfo) {
		// TODO Auto-generated method stub
		accountinfos.add(accountinfo);
	}

	@Override
	public boolean isLogin(String username, String password) {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(AccountInfo accountinfo : accountinfos) {
			if (username.equals(accountinfo.getUsername())&&password.equals(accountinfo.getPassword())) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}
