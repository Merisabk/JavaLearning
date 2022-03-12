package com.qa.operators;


public class Calculator {
	
	public int add(int a, int b) {
		return a + b;
		
	}
	
	public int sub(int a, int b) {
		return a - b;
		
	}
	public int mul(int a, int b) {
		return a * b;
		
	}
	
	
	public double div(double a, double b) {
		if (a < b) {
			double x = a;
			double y = b;
			return x/y;
		} else
		System.out.println("Division cannot be made");
		return 0;
	}



	
}






