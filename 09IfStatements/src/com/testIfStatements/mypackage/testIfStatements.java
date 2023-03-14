package com.testIfStatements.mypackage;

import java.util.Scanner;

public class testIfStatements {

	public static void main(String[] args) {
		
		//if statement example
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = scanner.nextInt();

		if(age>=75) {
			System.out.println("You are old.");
		}
		else if(age>=18) {
			System.out.println("You are an adult");
		}
		else if(age>=13) {
			System.out.println("You are a teenager");
		}
		else
		{
			System.out.println("You are not an adult.");
		}
		
		scanner.close();
	}

}
