package com.whileLoop.mypackage;

import java.util.Scanner;

public class whilelooptest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String name = "";
		String age = "";
		
		while(name.isBlank()) {
			System.out.println("Input your name :");
			name= scanner.nextLine();
		}

		System.out.println("Hello " + name);
		
		//do loop variation:
		
		do {
			System.out.println("Input your age :");
			age= scanner.nextLine();
		}while(age.isBlank());
		
		System.out.println("your age is " + age + "?");
		
		scanner.close();
	}

}
