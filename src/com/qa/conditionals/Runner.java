package com.qa.conditionals;

public class Runner {

	public static void main(String[] args) {
		
//		ResultsRevisited r = new ResultsRevisited(10, 150, 150);
//		r.methodOne();
//		r.methodTwo();
//		r.showPercentage();
		
//		
//		Blackjack b = new Blackjack();
//		System.out.println(b.play(20, 18));
//	
//		
//		UniqueSum s = new UniqueSum();
//		System.out.println(s.add(5, 7, 5));;
		
		Tax t = new Tax();
		System.out.println("Tax Percentage:       " + t.methodOne(30000) + "%");
		System.out.println("Tax:                  " + t.methodTwo(30000));
		System.out.println("Salary after Tax:     " + t.methodThree(30000));

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		//boolean flag = true;
//		int num =1;
//		int num2 = 10;
//		 
//		if (num < 20) {
//			System.out.println("The number is < 20");
//		} else if (num < 40) {
//			System.out.println("The number is less than 40");
//		}
//		else {
//			System.out.println("Neither is true");
//		}
		
// ----------------------------------------- Switch case -----------------------------------------------------------------//
		
//		// Switch case looks for a matching case once it finds the case, it just cascades down. To stop that from happening we add break;
//		switch(num) {
//		case 1: 
//			System.out.println("Number is 1");
//			break;
//			
//		case 2: 
//			System.out.println("Number is 2");
//			break;
//		case 3: 
//			System.out.println("Number is 3");
//			break;
//		default: 
//			System.out.println("Number is something else");
//			
//		
//		}
	}

}
