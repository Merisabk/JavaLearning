package com.qa.oop.interfaces;

public class Motorbike extends Vehicle {
	private String type;
	private int gears;
	
	public Motorbike(String make, int yearModel, int noOfDoors, String colour, String type, int gears) {
		this.setMake(make);
		this.setYearModel(yearModel);
		this.setNoOfDoors(noOfDoors);
		this.setColour(colour);
		this.type = type;
		this.gears = gears;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	} 
	
	
	@Override
	public String toString() {
		return "Motorbike [make=" + this.getMake() + ", yearModel=" + this.getYearModel() + ", noOfDoors= " + this.getNoOfDoors() + ", Colour= " + this.getColour() 
		+ ", Type= " + type + ", Gears=" + gears + "]";
	}
	

	
}
