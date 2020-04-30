package com.revarure.beans;

public class Admin extends Employee {
	private int adminId = 1;
	

	public Admin(){
		super();
		this.adminId = GenerateID.getCurrentID();
		this.userType = "AD";
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + "]";
	}
	
	void deleteAccount() {
		
	}
	

}
