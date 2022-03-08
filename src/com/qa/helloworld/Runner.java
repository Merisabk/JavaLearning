package com.qa.helloworld;

public class Runner {
	
	public static void main(String[] args) {
		
		
		HelloWorld myObject = new HelloWorld();
		myObject.helloWorld();
		myObject.printMessage("Hello World", "This is more text", 10);
		
		String result = myObject.concatText("Hello", "World");
		System.out.println(result);
		
		
	}

}
