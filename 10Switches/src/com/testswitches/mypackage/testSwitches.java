package com.testswitches.mypackage;

import java.util.Scanner;

public class testSwitches {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input day of a week :");
		String day = scanner.nextLine();
		
		//sample switch
		
		switch(day) {
		case "Sunday":
		case "sunday":
			System.out.println("It is Sunday");
			break;
		case "Monday":
		case "monday":
			System.out.println("It is Monday");
			break;
		case "Tuesday":
		case "tuesday":
			System.out.println("It is Tuesday");
			break;
		case "Wednesday":
		case "wednesday":
			System.out.println("It is Wednesday");
			break;
		case "Thursday":
		case "thursday":
			System.out.println("It is Thursday");
			break;
		case "Friday":
		case "friday":
			System.out.println("It is Friday");
			break;
		case "Saturday":
		case "saturday":	
			System.out.println("It is Saturday");
			break;
		default: System.out.println("not a valid option.");
		}
		
		scanner.close();
		
	}

}
