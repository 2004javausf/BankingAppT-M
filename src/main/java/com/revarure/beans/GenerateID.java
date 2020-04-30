package com.revarure.beans;

public class GenerateID {
	private static int nextID = 1;
	
	public static int getCurrentID() {
		int currentID = nextID;
		nextID++;
		return currentID;
		
	}
	//if Id is for a customer it will have CUS and force it to have a certain number of digits
	//if Id is for a admin it will have AD and force it to have a certain number of digits
	//if Id is for a employee it will have EMP and force it to have a certain number of digits
	

}
