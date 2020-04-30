package com.revature.dao;

import com.revarure.beans.Account;

public interface AccountInfoDao {
	//this interface is for register and login
	
	//register
	public abstract void register(Account accountinfo);
	//login
	public abstract boolean isLogin(String username, String password);

}
