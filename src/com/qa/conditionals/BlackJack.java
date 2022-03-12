package com.qa.conditionals;

public class Blackjack {
			
	public int play(int a, int b) {
		if (a > 21 && b > 21) {
			return 0;
		}
		
		if (a < b && b > 21) {
			return a;
		} else 
			if (b < a && a >21) {
				return b;
			} else {
				return Math.max(a, b);   // Math.max function returns the largest of the zero or more numbers given as input parameters. 
			}
		
	}
}
