package com.qa.stringmanipulation;


public class Runner {

	public static void main(String[] args) {
		
		
		// ------------------Exercise----------------------//
		// Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”
		//Concatenate both values, capitalise both strings and print out the result.
		//The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
		
		String s = "Yesterday it was raining";
		String s1 = "Today it is sunny";
		
		String message = ( s1.toUpperCase()+ ", " + s.toUpperCase() );
		
		System.out.println(message);
		//System.out.println(s.concat(" \n" ).concat(s1));
		
		// -- Now use the substring method to print out: `TODAY IT IS RAINING`
		
		System.out.println(message.substring(0, 12)+ message.substring(36, 43));
		
		
//			For this task you are to implement 4 methods that manipulate String objects.
//			For all parts of this section you are only allowed to use the length(), substring(), and equals() methods.
// 			Avoid using arrays or any methods you have yet to be taught as this defeats the purpose of the exercise:
//

//			Method 3 - When given a String, print out this String in a vertical fashion in reverse order, each word on a different line.
//			Method 4 - A find method, which takes 2 Strings; the first is message and the second is the String you want to find in the message. 
				//A boolean value should be returned to indicate whether or not the second String has been found in the message.
//		
		
		
		
//		Method 1 - When given a String, count and return how many words there are in that String.
		String[] removeSpaces = message.split(" ");
		System.out.println((removeSpaces.length));
		
//		Method 2 - When given a String, print out this String in a vertical fashion, each word on a different line.
		
		    for (int i = 0; i < message.length(); i++) {
		        System.out.println(message.charAt(i));
		    }
		


		
		
		
		
		
		
		
		
		
		
		
//		String myString = "Message";
//		String anotherString = "Message";
//		
//		if (myString == anotherString) {
//			System.out.println("Success!");
//		}
//	

//		// Two different objects! 
//		String myString = new String("Message");
//		String anotherString = new String ("Message");
//		
//		// Are these objects the same? Not the value but the objects themselves. 
//		if (myString == anotherString) {
//			System.out.println("Success!");
//		}
//		
//		// Is the value of the strings the same? 
//		if (myString.equals(anotherString)) {
//			System.out.println(("Success!"));
//		}
//		
//		// Get the length of my String. 
//		System.out.println(myString.length());
//		
//		//Concatenation
//		String thirdString = myString + " " + anotherString;
//		System.out.println(thirdString);
//		
//		String fourthString = myString.concat(" ").concat(anotherString);
//		System.out.println(fourthString);
//		
//		Integer num = 10; 
//		String fifthString = fourthString + " " + num;
//		System.out.println(fifthString);
//		
//		// String manipulation methods 
//		
//		// Substring - extract strings from within other strings
//		System.out.println(thirdString.substring(0, 3));
//		
//		// change case
//		System.out.println(thirdString.toUpperCase());
//		System.out.println(thirdString.toLowerCase());
//		
//		// Get the character at a specific index
//		System.out.println(thirdString.charAt(3));
//		
//		// Get the position/index of a character.
//		// four index of methods 
//		// by default it will always return the first occurence. 
//		//if you want to find another 'e' you need to use other methods.
//		System.out.println(thirdString.indexOf('e', 2));
//		
//		// Starts with 
//		System.out.println(thirdString.startsWith("Mes"));
//		
//		// Replace 
//		System.out.println(thirdString.replace("Mes", "MES"));
		
	}
	
}
