package com.TestVariableInputs.mypackage;

import java.util.Scanner;

public class TestVariableInputs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name? ");
		String name = scanner.nextLine();
		
		System.out.println("How old are you? ");
		int age = scanner.nextInt();
		scanner.nextLine();				/*needed to not skip the next question; 
										*has something to do with nextInt() 
										*not having escape sequence unlike nextLine()
										*/
		
		System.out.println("Favorite food? ");
		String food = scanner.nextLine();
		scanner.close();
		
		System.out.println("Hello " + name + "");
		System.out.println("You are " + age + " years old.");
		System.out.println("You like " + food + "");
	}
}
