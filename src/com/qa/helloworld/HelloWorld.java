package com.qa.helloworld;

//public class HelloWorld {  // The naming convention for classes are pascal case. 

//	public static void helloWorld() {   // this is a method. The naming convention for method and variable is camelcase - the first letter is lower case. 
//		// Datatype variableName = value;  //Variable is an empty box to put things in. 
//		String helloWorld = "Hello Word\nThis is more text";
//		System.out.println(helloWorld);
//	}
//	 // The main method is the entry point for execution of our program. 
//	public static void main(String[] args) {
//		helloWorld(); // calling a method which is in line 5.  
//	}
//}


public class HelloWorld {
	
	public static void printMessage(String messageOne, String messageTwo, int number) {
		System.out.println(messageOne + "\n" + messageTwo + "\n" + number); // we are taking the msg in and printing it. 
	}
	
	public static String concatText(String x, String y) { // a return method. Its going to take 2 strings and return a string.
		return x + " " + y; 
	}


public static void main (String[] args) {
//	printMessage("HelloWorld", "more text", 10);
	//concatText("Hello",  "World"); // doesn't print anything. It returns the value back to where the method was called. we are not doing anything with it. 
									// we are not storing it or printing it. 
	//System.out.println(concatText("Hello",  "World")); // print the return directly in the method call 
	String result = concatText ("Hello", "World"); // store result. code replaced by the return value in line 24. We can use the returned value later on. 
	System.out.println(result);
}
}
