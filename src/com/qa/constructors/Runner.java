package com.qa.constructors;

public class Runner {

	public static void main(String[] args) {
		
	Person John = new Person("John", 20, 'M');
	System.out.println("Name: " + John.name);
	System.out.println("Age: " + John.age);
	System.out.println("Gender: " + John.gender);
	
	System.out.println();
	
	Person Jess = new Person("Jess", 21, 'F');
	System.out.println("Name: " + Jess.name);
	System.out.println("Age: " + Jess.age);
	System.out.println("Gender: " + Jess.gender);
	
	System.out.println();
	
	Person j = new Person(); 
	System.out.println("Name: " + j.name);
	System.out.println("Age: " + j.age);
	System.out.println("Gender: " + j.gender);



	}

}
