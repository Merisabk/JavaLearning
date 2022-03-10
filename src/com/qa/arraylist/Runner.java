package com.qa.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a new arraylist
		List<String> listOfStrings = new ArrayList<>();
		
		// How to add to the array list
		listOfStrings.add("Hello");
		listOfStrings.add("World");
		
		// How we get values out of the array list


		// Change a value at the specified index in the array list 
		listOfStrings.set(0, "Hi");
		System.out.println(listOfStrings.get(0));
		
		// Remove element from the list based on index position
		listOfStrings.remove(1);
		System.out.println(listOfStrings);
		
		// Get the length of the array list
		System.out.println("The Length is: " + listOfStrings.size() );
		
//		// Clear the array list (remove all values)
//		listOfStrings.clear();
//		System.out.println(listOfStrings.size());
//		System.out.println(listOfStrings);
		
		for (int i = 0; i < listOfStrings.size(); i++)
		{
			System.out.println(listOfStrings.get(i));
		}
		
		for (String str : listOfStrings) {
			System.out.println(str);
			
		}
	}
	
	

}
