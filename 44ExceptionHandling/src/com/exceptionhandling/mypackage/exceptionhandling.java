package com.exceptionhandling.mypackage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionhandling {

	public static void main(String[] args) {
		
		//exception = an event that occur during the execution of a program test,
		//				disrupts the normal flow of instructions

		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter a whole number to divide:");
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole number to divide by:");
			int y = scanner.nextInt();
			
			int z = x/y;
			
			System.out.println("result : " + z);
		}
		catch(ArithmeticException e) {
			System.out.println("Cant divide by zero");
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter a number, not letter");
		}
		catch(Exception e) {
			System.out.println("Something went wrong:" + e);
		}
		finally{
			scanner.close();
			System.out.println("finally");
		}
		
		
	}
}
