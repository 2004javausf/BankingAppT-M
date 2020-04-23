package com.employees.beans;

import java.util.ArrayList;

public class Employee {
	private static ArrayList<Integer> availableIDs = null;
	private String userName;
	private String password;
	Boolean isAdmin = false;
	private long employeeID;
	
	public Employee() {
		
	}
	
	public Employee(String userName, String password, Boolean isAdmin, long employeeID) {
		super();
		this.userName = userName;
		this.password = password;
		this.isAdmin = isAdmin;
		this.employeeID = employeeID;
	}

	
	public static ArrayList<Integer> getAvailableIDs() {
		return availableIDs;
	}
	public static void setAvailableIDs(ArrayList<Integer> availableIDs) {
		Employee.availableIDs = availableIDs;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	public long getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}
}
