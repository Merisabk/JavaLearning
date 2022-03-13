package com.qa.stringmanipulation;
import java.util.ArrayList;
import java.util.List;

public class StringsExercise {
	public void methodOne() {
		// ------------------Exercise----------------------//
		// Create two Strings where one string has a value of “yesterday it was raining” and the other string with a value of “today it is sunny”
		//Concatenate both values, capitalise both strings and print out the result.
		//The result should be: TODAY IT IS SUNNY, YESTERDAY IT WAS RAINING
		
	String a = "yesterday it was raining";
	String b = "today it is sunny";
	
	//System.out.println(a.concat(" \n" ).concat(b));
	String c = b.toUpperCase() + "," + a.toUpperCase();
	System.out.println(c);

	// -- Now use the substring method to print out: `TODAY IT IS RAINING`
   // System.out.println(c.indexOf("RAI"));
	System.out.println(c.substring(0, 12)+ c.substring(35, 42));
	
	
	
	
	
	}
	
		
	
	
}
