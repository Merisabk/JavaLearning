package com.qa.scope;

public class Scope {
	
	// inside the class but outside of methods is known as class level. 
	//Things that are declared in this level can be accessed/seen across the entire class. 
	//Everything in the class can access this variable. 
	//This is a class level scope (instance scope)
	public String message = "Hello";  
	
	public void methodOne() {
		// This is local scope (method scope) - can only be seen and used inside this method.
		// if we have 2 variables with same type and same name. The scope that takes precedence is one closet to the call.
		String message = "Goodbye";
		System.out.println(message);
	}
	
	// In java, we can create a method with the same name as another method. 
	// This is called method overloading. 
	// just because it has no parameters, its seen as a separate method.
	// Java decides which one to use is based on method signature. one takes a string, one doesn't. 
	// It has to have different signatures. 
	public void methodTwo () {
		System.out.println(message);
	}
	
	public void methodTwo(String message) {
		System.out.println(message);
	}
	

	
	}

