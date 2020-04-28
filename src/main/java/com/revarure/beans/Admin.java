package com.revarure.beans;

public class Admin extends Employee {
	private int adminId = -1;
	

	public Admin() {
		super();
	}

	public Admin(int adminId) {
		super();
		this.adminId = adminId;
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
