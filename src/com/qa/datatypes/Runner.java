package com.qa.datatypes;

public class Runner {

	public static void main(String[] args) {
		char myChar = 'a'; 
		char myCharTwo = 'b';
		char myCharThree = 'c';
		
		//int myString = myChar + myCharTwo + myCharThree; //  chars have a numerial representation. 
		
		// Demicals default to double 
		System.out.println(10.999);
		
		// Floats must be labelled with 'f'
		// Primitive data-type is lower case. 
		float myDecimal = 10.999f;
		
		// Objects such as String contain useful methods. 
		String myString = "Hello";
		System.out.println(myString.toLowerCase());
		
		
		// Wrapper Classes (wrap primitive types in a non-primitive type) 
		// used to wrap primitives in objects, so they have object methods. 
		// float is a primitive. 
		//created another variable. The dataype is non-premitive because it is capitalised but it is still a float.
		// This gives us access to float methods.
		// objectFloat. -- gives access to float methods. 
		Float objectFloat = myDecimal; 
		Integer objectInt = 5;
		Long objectLong = 10L;
		Double objectDouble = 10.5;
		
		
	}

	
}
