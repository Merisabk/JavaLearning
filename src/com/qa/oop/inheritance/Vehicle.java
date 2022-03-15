package com.qa.oop.inheritance;

public class Vehicle {
	
	private String make;
	private int yearModel;
	private int noOfDoors;
	private String colour;
	
	public Vehicle() {}
	
	public Vehicle(String make, int yearModel, int noOfDoors, String colour) {
		this.make = make;
		this.yearModel = yearModel;
		this.noOfDoors = noOfDoors;
		this.colour = colour;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getYearModel() {
		return yearModel;
	}

	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	public int getNoOfDoors() {
		return noOfDoors;
	}

	public void setNoOfDoors(int noOfDoors) {
		this.noOfDoors = noOfDoors;
	}

	
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", yearModel=" + yearModel + ", noOfDoors=" + noOfDoors + "]";
	}
	
	
	

}
