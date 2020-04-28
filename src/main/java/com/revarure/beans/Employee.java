package com.revarure.beans;

public class Employee {
	private int employeeID = -1;
	

	public Employee() {
		super();
	}

	public Employee(int employeeID) {
		super();
		this.employeeID = employeeID;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + "]";
	}
	
void createUser() {
		
	}
void createAccount() {
	
}
	
}
