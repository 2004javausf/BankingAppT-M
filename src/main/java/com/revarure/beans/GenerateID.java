package com.revarure.beans;

public class GenerateID {
	static int nextID = 00001;
	
	public static int getCurrentID(String sSN) {
		int lastTwoOfSSN = Integer.parseInt(sSN.substring(sSN.length()-2, sSN.length()));
		int currentID = nextID;
		nextID++;
		int randomNumber = (int)(Math.random() * Math.pow(10, 3));//generates a 3 digit number
		return lastTwoOfSSN + currentID + randomNumber;//generates a number that will be attached to the various prefixes for different individuals in Banking System
		
	}
	//if Id is for a customer it will have CUS and force it to have a certain number of digits
	//if Id is for a admin it will have AD and force it to have a certain number of digits
	//if Id is for a employee it will have EMP and force it to have a certain number of digits
	

}
