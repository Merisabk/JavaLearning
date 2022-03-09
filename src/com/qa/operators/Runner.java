package com.qa.operators;

public class Runner {
	
	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		System.out.println(c.add(5, 9));
		System.out.println(c.sub(20, 10));
		System.out.println(c.mul(6, 6));
		System.out.println(c.div(25, 5));
		
		Results r = new Results(100, 140, 110);
		r.methodOne();
		r.methodTwo();
	}
}