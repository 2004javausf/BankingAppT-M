package com.revature.dao;

import java.util.ArrayList;

import com.revarure.beans.Account;
import com.revarure.beans.User;

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
	//TODO: come back and do these methods to complete Dao
	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	//checking if user exists in database by username and email
	public boolean checkUserExists(String username, String email) {
		if(checkUserExists(username)|| checkEmailExists(email)) {
			return true;
		}else {
			return false;
		}
	}

	private boolean checkEmailExists(String email) {
		if(null != findByEmail(email)) {
			return true;
		}
		return false;
	}

	private boolean checkUserExists(String username) {
		if(null != findByUsername(username)) {
		return true;
	}
		return false;
	}

}
