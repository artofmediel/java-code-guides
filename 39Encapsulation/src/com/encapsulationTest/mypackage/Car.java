package com.encapsulationTest.mypackage;

public class Car {

	//adds protection, so they can't be directly accessed anywhere else within the program
	private String make;
	private String model;
	private int year;
	
	Car(String make, String model, int year){
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
		
	}

	//GETTER METHODS -------------------------
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	//SETTER METHODS -------------------------
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}

