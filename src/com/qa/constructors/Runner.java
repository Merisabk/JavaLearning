package com.qa.constructors;


public class Runner {

	public static void main(String[] args) {
		
	Person john = new Person("John", 20, 'M');
	System.out.println("Name: " + john.name);
	System.out.println("Age: " + john.age);
	System.out.println("Gender: " + john.gender);
	
	System.out.println();
	
	Person jess = new Person("Jess", 21, 'F');
	System.out.println("Name: " + jess.name);
	System.out.println("Age: " + jess.age);
	System.out.println("Gender: " + jess.gender);
	
	System.out.println();
	
	// This constructor will use default values
	Person j = new Person(); 
	System.out.println("Name: " + j.name);
	System.out.println("Age: " + j.age);
	System.out.println("Gender: " + j.gender);
	
	System.out.println();
	
	j.age = 26;
	System.out.println("Age: " + j.age);
	
	j.name = "Joel";
	System.out.println("Name: " + j.name);
	
	j.gender = 'M';
	System.out.println("Gender: " + j.gender);
	



	}

}
