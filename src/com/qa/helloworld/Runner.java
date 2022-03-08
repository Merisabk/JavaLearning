package com.qa.helloworld;

public class Runner {
	
	public static void main(String[] args) {
		
		HelloWorld myObject = new HelloWorld();
		
		String result = myObject.concatText("Hello", "World");
		System.out.println(result);
		
		
	}

}
