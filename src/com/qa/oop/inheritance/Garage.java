package com.qa.oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Garage extends Vehicle {

	private List<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle input) {
		vehicles.add(input);
	}

	public void removeVehicle(Vehicle vehicle) {
		if (vehicles.remove(vehicle)) {
			System.out.println("Vehicle removed");
		}
	}

	public void removeVehicleByType(String make) {
		List<Vehicle> found = new ArrayList<Vehicle>();
		for (Vehicle v : vehicles) {
			if (v.getMake().equals(make)) {
				found.add(v);
			}

			for (Vehicle destory : found) {
				vehicles.remove(destory);
			}

		}
	}

	public void emptyGarage() {
		vehicles.clear();

	}

	public void printAll() {
		for (Vehicle vehicle : this.vehicles) {
			System.out.println(vehicle);
		}
	}

	public void calculateBill() {

		for (Vehicle vehicle : this.vehicles) {
			if (vehicle.getMake().equals("Toyota")) {
				System.out.println("Bill for " + vehicle.getMake() + " is £" + (100 * 10));
			} else if (vehicle.getMake().equals("Ford")) {
				System.out.println("Bill for " + vehicle.getMake() + " is £" + (200 * 10));
			} else if (vehicle.getMake().equals("Volkswagen")) {
				System.out.println("Bill for " + vehicle.getMake() + " is £" + (300 * 10));
			}
		}

	}

}


	
