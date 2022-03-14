package com.qa.oop.encapsulation;


public class Runner {

	public static void main(String[] args) {

			Person aidan = new Person("Aidan", 27, "Doctor");
			Person guinn = new Person("Guinn", 30, "Actress");
			Person eliza = new Person("Eliza", 22, "UX designer");
			Person monika = new Person("Monika", 28, "UX designer");
			
			PersonManager pm = new PersonManager();
			pm.add(aidan);
			pm.add(guinn);
			pm.add(eliza);
			pm.add(monika);
//			pm.search("Eliza");
			pm.showAll();

//			System.out.println(aidan);
//			System.out.println();
//			System.out.println(guinn);
//			System.out.println();
//			System.out.println(eliza);
//			System.out.println();
//			System.out.println(monika);
		
	}

}
