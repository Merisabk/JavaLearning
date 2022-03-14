package com.qa.oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	
	public static void main(String[] args) {
		
		Dog dog = new Dog (15, 4, "black", "husky", false);
		System.out.println(dog);
		dog.makeNoise();
		
		Cat cat = new Cat();
		cat.makeNoise();
		
		List<Animal> listOfAnimals = new ArrayList<>();
		listOfAnimals.add(dog);
		listOfAnimals.add(cat);
	}
	

}
