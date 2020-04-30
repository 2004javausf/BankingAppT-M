package com.revarure.beans;

public class Employee extends User {
	private int employeeID = 1;
	private String password;
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Employee() {
		super();
		this.userType = "EM";
		
	}
	
	public Employee(int employeeID) {
		super();
		this.userType = "EM";
		
	}



	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + "password" + password + "]";
	}
	
	
	void createAccount() {
		
	}
	public void readCustomerInfo() {
		
	}
	
	
}
