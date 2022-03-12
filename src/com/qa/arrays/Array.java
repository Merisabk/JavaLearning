package com.qa.arrays;

public class Array {
	//Create an array that will hold 10 integer values, populate the array with values, then call and output each element.
	public void methodOne() {
		int[] array = new int[10]; 
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		array[5] = 60;
		array[6] = 70;
		array[7] = 80;
		array[8] = 90;
		array[9] = 100;
		
 //	Create a for loop that populates an integer array with values, outputting them at each iteration.
	 for (int i = 0; i < array.length; i++) 
	 System.out.println(array[i]);
	 
//Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, 
//outputting them at each iteration.
	for (int i = 0; i < array.length; i++) {
		array[i] = 10;
		 System.out.println(array[i]);	
	}
	
	 }
	 

	} 
	




