package com.qa.operators;

public class Runner {
	
	public static void main(String[] args) {
//		int numOne = 10; 
//		int numTwo = 20;
//		System.out.println(numOne + numTwo);
//		System.out.println(numOne - numTwo);
//		System.out.println(numOne * numTwo);
//		System.out.println((float)numOne / (float)numTwo);
		
// -----------------------------------Modulus -------------------------------------------// 
		// Modulus ( returns a remainder when doing a division)
		// We use modulus to see whether one number divides evenly into another. 
		// If it does the result will be 0. 
//		System.out.println(10 % 2); // 5 remainder 0 // This means it fits into 10 perfectly. 
//		System.out.println(10 % 3); // 3 remainder 1 
		
		
// ------------------------------------Unary--------------------------------------------------//
		// Unary ++ will increment the value by 1. 
//		System.out.println(++numOne); // Increment first, then print
//		System.out.println(numOne++); // print first, then increment
		
		// numOne += numOne; (shorthand for numbOne = numOne+numOne)
//		numOne = numOne + numOne;
//		System.out.println(numOne);
		
//		numTwo += 1; // numTwo = numTwo + 1;
//		System.out.println(numTwo);
//
		Calculator c = new Calculator();
//		System.out.println(c.add(5, 10));
//		System.out.println(c.sub(10, 5));
//		System.out.println(c.mul(5, 5));
//		System.out.println(c.div(25,4));
		System.out.println(c.div(20, 10.6));
	
//		
//		Results r = new Results(100, 150, 90);
//		r.methodOne();
//		r.methodTwo();
		
	}
}