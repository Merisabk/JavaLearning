package com.qa.oop.encapsulation;

public class Runner {

	public static void main(String[] args) {
			
			Lists l = new Lists();
			l.method1();
			

			Person aidan = new Person("Aidan", 27, "Doctor");
			Person guinn = new Person("Guinn", 30, "Nurse");
			Person eliza = new Person("Eliza", 22, "UX designer");
		
			
			
			System.out.println(aidan.toString());
			System.out.println();
			System.out.println(guinn.toString());
			System.out.println();
			System.out.println(eliza.toString());
			
	}

}
