package com.qa.operators;

public class Runner {

	public static void main(String[] args) {
	
		Calculator c = new Calculator();
		c.methodOne();
		c.methodTwo();
		c.methodThree();
		c.methodFour();
		
		Results r = new Results(95, 100, 120);
		r.methodOne();
		r.methodTwo();
		
		
		
	
	}

}