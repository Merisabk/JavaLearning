package com.qa.scope;

public class Runner {

	public static void main(String[] args) {
		
		// default constructor for the class. 
		// exists for every user defined class. 
		Scope myObj = new Scope();
		
		myObj.methodOne();
		myObj.methodTwo("Another Message");
		myObj.methodTwo();
		
	
	}

}
