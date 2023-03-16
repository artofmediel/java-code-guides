package com.dynamicpolymorphism.mypackage;

import java.util.Scanner;

public class dynamicpolymorphism {

	public static void main(String[] args) {
		
		// polymorphism = many shapes / forms
		// dynamic = after compilation ( during runtime )
		
		// ex. A corvette is a : corvette, and a car, and a vehicle, and an object

		Animal animal;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Choose an animal:");
		System.out.println("[1] dog \t [2] cat");
		int choice = scanner.nextInt();
				
		if(choice == 1) {
			animal = new Dog();
			animal.speak();
		} else if(choice == 2) {
			animal = new Cat();
			animal.speak();
		} else {
			animal = new Animal();
			System.out.println("Invalid choice.");
			animal.speak();
		}
		
		scanner.close();
	}

}
