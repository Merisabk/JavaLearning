package com.qa.iteration;
import java.util.ArrayList;
import java.util.List;

public class Coins {
	
	public void coins (double cost, double payment) {
		double changeGiven = payment - cost;
		int tenNote = 0;
		int fiveNote = 0;
		int twentyp = 0;
		int twop = 0;
		int onep = 0;
		
		while (changeGiven >= 10) {
			changeGiven = changeGiven - 10;
			tenNote++;
		} 
		
		while (changeGiven >= 5) {
			changeGiven = changeGiven - 5;
			fiveNote++;
		} 
		
		while (changeGiven >= 0.2) {
			changeGiven = changeGiven - 0.2;
			twentyp++;
		} 
		while (changeGiven >= 0.019) {
			changeGiven = changeGiven - 0.019;
			twop++;
		} 
		
		while (changeGiven >= 0.009) {
			changeGiven = changeGiven - 0.009;
			onep++;
		} 
		System.out.println("Ten pound notes: " + tenNote);
		System.out.println("Five pound notes: " + fiveNote);
		System.out.println("Twenty pence coins: " + twentyp);
		System.out.println("Two pence coins: " + twop);
		System.out.println("One pence coins: " + onep);
	}

	
	public void project() {
		for (int i =100; i <= 200; i++) {
		System.out.println(i);
			}
	
	}
		
	public void project2() 
	{
		for (int A = 100; A%2 == 0; A++) {
			System.out.println("-");
			
		if (A != 0) {
				System.out.println("*");
				A++; 
				if (A <= 200) {
					continue;
				} else break;			
			}		
			}		
		}
	// Create a method that can print out the numbers 1-10 10 times each. 
	public void methodOne() {

		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			
		
		}
	}
	
	// Create a method to print the numbers 1 to 10 as many times as the value of that number. 

}
	
	
		
	



