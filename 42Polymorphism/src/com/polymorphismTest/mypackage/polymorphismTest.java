package com.polymorphismTest.mypackage;

public class polymorphismTest {
	
	public static void main(String[] args) {
		
		// polymorphism - ability of an object to identify as more than 1 type
		
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bicycle,boat};
		
		//display go methods
		
		//car.go();
		//bicycle.go();
		//boat.go();
		
		// could also be like this since they all on the same vehicle array
		for(Vehicle x: racers) {
			x.go();
		}
		
	}
}
