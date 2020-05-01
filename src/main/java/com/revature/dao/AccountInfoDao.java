package com.revature.dao;

import com.revarure.beans.Account;
import com.revarure.beans.User;

public interface AccountInfoDao {
	//this interface is for register and login
	
	User findByUsername(String username);
	User findByEmail(String email);
	
	//register
	public abstract void register(Account accountinfo);
	//login
	public abstract boolean isLogin(String username, String password);

}
