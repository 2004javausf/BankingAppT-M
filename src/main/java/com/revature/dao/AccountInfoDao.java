package com.revature.dao;

import com.revarure.beans.AccountInfo;

public interface AccountInfoDao {
	//this interface is for register and login
	
	//register
	public abstract void register(AccountInfo accountinfo);
	//login
	public abstract boolean isLogin(String username, String password);

}
