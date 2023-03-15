package com.oop.mypackage;

public class oop {

	public static void main(String[] args) {

		// object  = an instance of a class that may contain attributes and methods; like a bundle
		// ex : (phone, desk, computer, coffee)
		
		//invoke the Car class
		Car myCar = new Car();
		
		
		//retrieve data from the Car object
		System.out.println(myCar.make);
		System.out.println(myCar.model);
		//call method from the Car object
		myCar.drive();
		myCar.brake();
		
		System.out.println("\n");
		
		//example 2
		Car myCar2= new Car();

		System.out.println(myCar2.year);
		System.out.println(myCar2.color);
		System.out.println(myCar2.price);
	}

}
