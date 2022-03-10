package com.qa.iteration;

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

}
