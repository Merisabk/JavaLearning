package com.qa.oop.inheritance;

public class Runner {
	
	public static void main(String[] args) {

		Car car = new Car("Toyota", 2013, 5, "blue", 4, "tube");
		Motorbike bike = new Motorbike("Ford", 2021, 0, "black", "sportsbike", 2);
		Van van = new Van("Volkswagen", 2019, 3, "silver", "minibus");
		
		Garage garage = new Garage();
		garage.addVehicle(car);
		garage.addVehicle(bike);
		garage.addVehicle(van);
		garage.calculateBill();
		garage.printAll();
		garage.removeVehicle(car);
		garage.printAll();

		garage.emptyGarage();
		garage.printAll();
		garage.removeVehicleByType("bike");
		garage.printAll();
	

//		Dog dog = new Dog (15, 4, "black", "husky", false);
//		System.out.println(dog);
//		dog.makeNoise();
//		
//		Cat cat = new Cat();
//		cat.makeNoise();
//		
//		List<Animal> listOfAnimals = new ArrayList<>();
//		listOfAnimals.add(dog);
//		listOfAnimals.add(cat);
	}
	

}
