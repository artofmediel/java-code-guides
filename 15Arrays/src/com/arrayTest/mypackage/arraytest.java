package com.arrayTest.mypackage;

import java.util.Scanner;

public class arraytest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//can declare array with limit like this without assigning values
		//String[] cars = new String[5];
		
		String[] cars = {"Tesla","Ford","Audi","Corvette","Toyota"};
		String carresult="";
		
		//display via index
		System.out.println("choose a car by their number [0-4]:");
		int index = scanner.nextInt();
		scanner.nextLine();
		
		//assigning value to array via index
		//cars[0] = "Tesla";
		//cars[1] = "Ford";
		// ands so on..
		//cars[4] = "Toyota";
		
		/*display all
		*for(int x=0;x<=cars.length;x++) {
		*	System.out.println("car[" + x + "] is " + cars[x]);
		*}
		*/
		
		if(index<=4) {		//prevents array out of bounds error
			
			//scan the array 0 to 4 and display chosen car
			for(int x=0;x<=index;x++) {
				//if match found
				if(x==index) {
					carresult = "car " + cars[x] + " is chosen.";
					System.out.println(carresult);
				}
			}
			
		}
		
		if(carresult.isBlank()) {
			System.out.println("car not found.");
		}
		
		scanner.close();
	}

}
