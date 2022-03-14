package com.qa.oop.encapsulation;
import java.util.ArrayList;
import java.util.List;

public class PersonManager {
	private List<Person> people = new ArrayList<>();
	
	public void add(Person person) {
		people.add(person);
		
	}
	
	
	//Create a method that can search for a specific Person by their name.
	public void search (String name) {

	for (Person person : this.people) {
		if (person.getName().equals(name)) {
			System.out.println(person);
		}
	}
	}
	//Use a stream to output all of your people to the console.
	public void showAll() {
		for (Person person : people) {
			System.out.println(person);
		}
	}
		
	}
	
	
	

