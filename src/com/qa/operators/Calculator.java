package com.qa.operators;

public class Calculator {
	
	int numberOne = 25;
	int numberTwo = 5;
	
	public void methodOne() {
		int result = numberOne + numberTwo;
		System.out.println(result);
		}
	

	public void methodTwo() {
		int result = numberOne * numberTwo;
		System.out.println(result);
	}
	
	public void methodThree() {
		int result = numberOne - numberTwo;
		System.out.println(result);
	}
	
	
	public void methodFour() {
		double result = numberOne / numberTwo;
		System.out.println(result);
	}
}
