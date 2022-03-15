package com.qa.oop.interfaces;

public class Car extends Vehicle implements Radio {
	
	private int numOfTyres;
	private String tyreType;

	public Car(String make, int yearModel, int noOfDoors, String colour, int numOfTyres, String tyreType ) {
//		super(make, yearModel, noOfDoors);
		this.setMake(make);
		this.setYearModel(yearModel);
		this.setNoOfDoors(noOfDoors);
		this.setColour(colour);
		this.numOfTyres = numOfTyres;
		this.tyreType = tyreType;
		
	}

 
	
	public int getNumOfTyres() {
		return numOfTyres;
	}

	public void setNumOfTyres(int numOfTyres) {
		this.numOfTyres = numOfTyres;
	}



	public String getTyreType() {
		return tyreType;
	}



	public void setTyreType(String tyreType) {
		this.tyreType = tyreType;
	}


	@Override
	public String toString() {
		return "Car [make= " + this.getMake() + ", yearModel= " + this.getYearModel() + ", noOfDoors= " + this.getNoOfDoors() + ", Colour= " + this.getColour() 
		+ ", NumbOfTyres= " + numOfTyres + ", Tyre-type= " + tyreType + "]";
	}



	@Override
	public void radioOn() {
		
	}


	@Override
	public void radioOff() {
		
	}

}
