package com.qa.arraylist;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;

public class Arraylist {
	
//	create a new ArrayList
//	add() several elements
//	print out the entire ArrayList
//	iterate through the ArrayList and print out each element (with both normal and enhanced for-loops)
//	get() specific elements
//	set() different elements
//	remove() elements
//	sort() the ArrayList (try this with several object types)
//	try using the reverse(), swap() and clear() methods.
	
	public void methodOne() {
	List<String> employees = new ArrayList<>();
	employees.add("Monika");
	employees.add("Eliza");
	employees.add("Alan");
	employees.add("Sam");
	System.out.println(employees);
	
	for (int i = 0; i < employees.size(); i++) {
		System.out.println(employees.get(i));
	}
//	System.out.println();
//	for (String str: employees) {
//	System.out.println(str);
//
//	}
//	
//	employees.set(1, "Samantha");
//	System.out.println(employees.get(1));
	
	System.out.println();
	
	employees.remove(1);
	System.out.println(employees);
	
	Collections.sort(employees);
	System.out.println(employees);
	
	Collections.sort(employees, Collections.reverseOrder());
	System.out.println(employees);
	
	}
	

}



//public class Arraylist {
//	public void list() {
	// syntax to create an array list.
	// we'll always use List and ArayList 
	//create a new arraylist
//	List <String> listOfStrings = new ArrayList<>();
//	
//	// Returns an unmodifiable aka imutable list
////	List <String> listOfStrings = List.of("Hello", "World");
////	
////	//Returns a regular list 
////	List <String> listOfStrings = Arrays.asList("Hello", "There");
//	
//	// How to add to the array list
//	listOfStrings.add("Hello");
//	listOfStrings.add("World");
//	
//	//how we get values out of the array list 
////	System.out.println(listOfStrings.get(1));
////	
////	// change a value at a specified index in the array list 
////	listOfStrings.set(0, "Hi");
////	System.out.println(listOfStrings.get(0));
//	
//	// Remove element from the list based on index position
////	listOfStrings.remove(1);
////	System.out.println(listOfStrings);
////
////	// Get the length of the array list 
////	System.out.println(listOfStrings.size());
////	
////	// Clear the array list (remove all values)
////	listOfStrings.clear();
////	System.out.println(listOfStrings);
//	
//	//looping through array list // 
//	//You don't use [] to identify the index. we dont use length but we use size. 
////	for (int i =0; 1 < listOfStrings.size(); i++) {
////		System.out.println(listOfStrings.get(i));
////	}
//	
//	// for each loop always goes from the beginning to the end. 
//	for (String str : listOfStrings) {
//		System.out.println(str);
//	}
//	
//	// Gives us the index position of an element, if its true. 
//	System.out.println(listOfStrings.indexOf("World"));
//	
//	System.out.println(listOfStrings.contains("Hello"));
	
	
//	List<String> myList = new ArrayList<>();
//	myList.add("zebra");
//	myList.add("cat");
//	myList.add("fox");
//	System.out.println("Original order: " + myList);
//	
//	// sort() defaults to sorting from A-Z for non-numeric types and in ascending order for numeric types. 
// 	Collections.sort(myList);
//	System.out.println("Sorted oder: " + myList);
//	
//	// this is sorting in descending order. 
//	Collections.sort(myList, Collections.reverseOrder());
//	System.out.println("Sorted Order(DESC: " + myList);
//	
//	
//	}
//	
//	
//}
