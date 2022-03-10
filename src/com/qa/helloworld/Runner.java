package com.qa.helloworld;

public class Runner {
// shorthand for main -- main + ctrl space and enter. 
public static void main (String[] args) {
	
	//We use our own user defined datatypes when creating objects and we store them in variables.
	// Car c = new Car();
	// Animal a = new Animal();
	// String/HelloWorld (anything that is capitalised is referring to a class and are non-primitive data-type)
	// All objects in Java come from classes. 
	HelloWorld myObj = new HelloWorld();
	
	myObj.helloWorld();
	myObj.printMessage("Hello World", "more text", 0);

	String result = myObj.concatText ("Hello", "World"); 
	System.out.println(result);
}
	

}

