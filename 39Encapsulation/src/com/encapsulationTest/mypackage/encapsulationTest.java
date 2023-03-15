package com.encapsulationTest.mypackage;


public class encapsulationTest {

	public static void main(String[] args) {
		
		//Encapsulation - attributes of a class will be hidden or private,
		//					can be accessed only through methods (getters &  setters)
		// 					you should make attributes private if you don't have a reason to make 
		//					them public or protected
		
		Car car = new Car("Chevrolet","Camaro",2021);

		//use getter methods
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
		//use setter methods
		car.setYear(2022);
		//test change
		System.out.println(car.getYear());
	}

}
