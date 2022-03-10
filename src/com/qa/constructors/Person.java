package com.qa.constructors;

	//In Java, a constructor is just a method. It has the same name as the class. 
	//a constructor is always the same name as the class. 
	//every class has a default constructor 

public class Person {
	
	// we tend to have properties in our class. 
	// that could of properties of a person would be variables in our class. No values given because it will be different for every person. 
	// You can give values - if its always going to be the same. 
	public String name;
	public int age; 
	public char gender;
	
	// Constructor doesn't have a return type. That doesn't mean void
	//(void is a return type that means the method doesn't return anything)
	// As long as they are different we can have as many constructors as we want. 
	public Person() {}
	
	
	// this. refers to the class itself.
	//this. means thisclass.name referring to the class level variables. 
	public Person  (String name, int age, char gender) {
		this.name = name; 
		this.age = age;
		this.gender = gender;
		
	}
	
	
	
		
	}
		
		


