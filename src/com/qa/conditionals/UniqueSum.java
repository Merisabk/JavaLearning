package com.qa.conditionals;

public class UniqueSum {
	
	public int add(int a, int b, int c) {
	
	if (a != b && b !=c && c != a) return 
		(a + b + c);
		 else
		if (a == b && b == c && c == a) {
			return 0;
		}
	if (a == b) {
		return c;
	}
	if (b ==c) {
		return a;
	}
	if (a == c) {
		return b;
	}
	return c;

	}
}
