package com.qa.oop.inheritance;

public class Van extends Vehicle {
	
	private String type;
	
	public Van (String make, int yearModel, int noOfDoors, String colour, String type) {
		this.setMake(make);
		this.setYearModel(yearModel);
		this.setNoOfDoors(noOfDoors);
		this.setColour(colour);
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Van [make=" + this.getMake() + ", yearModel=" + this.getYearModel() + ", noOfDoors=" + this.getNoOfDoors() + ", Colour= " + this.getColour()
		+ ", Type= " + type + "]";
	}

}
