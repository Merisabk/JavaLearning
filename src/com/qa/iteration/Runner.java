 package com.qa.iteration;
 
public class Runner {
	
	public static void main(String[] args) 
	
	{
		Coins c = new Coins();
		c.coins(4.58, 20);	
		c.project();
		c.project2();
		c.methodOne();
	}
	
	
	
}

 
//public class Runner {
//	
//	public static void main(String[] args) {
//// --------------------------------------------- for ()-loop ------------------------------------------------------------------
//	// first you define your variable- it will be an int and often called i or j. 
//	//Start at whatever number you want to start at. Normally loop will start at 0. 
//	// each component separate by semi-colon ; Then what's the condition. How long is this loop going to go for? 
//	// i < 10 // as soon as the i is 10 or more the loop stops. 
//	// if we want to include 10 we have to do <= 10 
//	// the final part of the loop is always i++ 
//		// i -- loops backward 
//			// for (int i = 10; i >=0; i--){
//			// System.out.println(i);
//		// i++ means increment by 1. 
////		for (int i = 0; i < 10; i++) {
////			
////		}
//		
//// ------------------------ while()-loop-----------------------------
//		// while loop could run forever. much more flexible.
//		
//		boolean flag = true;
//		int num1 =5;
//		int num2 = 10;
//		int count = 0;
//		// while flag == true 
//		while(flag) {
//			System.out.println("I'm looping.");
//			//break; we can use this to get out of the loop
//			count++;
//			
//			if (count >= 10) {
//				flag = false; // could also use break; here 
//			}
//		}
//		
//// ------------- do()-while ()loop -----------------
//		// the code that repeats will always run once before checking the condition. 
//		// checks the condition after it loops once whereas while loops checks condidtion first. 
//		do {
//			System.out.println("I'm looping");
//			count++;
//			if (count > 10) {
//				flag = false;
//			} 
//		} while(flag);
//		}
// 		
//		
//		
//}
//}