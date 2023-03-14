package com.Expressions.mypackage;

public class Expressions {
	public static void main(String[] args) {
			
		//expressions = operands & operators
		//operands = values, variables, numbers, quantity
		//operator = + - * / %
		
		int friends = 10;
		double freind;
		
		System.out.println("You have " + friends + " friends.");
		
		friends = friends + 1;	//add
		System.out.println("You have " + friends + " friends.");
		
		friends = friends - 2;	//sub
		System.out.println("You have " + friends + " friends.");
		
		friends = friends * 2;	//multiply
		System.out.println("You have " + friends + " friends.");
		
		friends = friends / 2;	//divide
		System.out.println("You have " + friends + " friends.");
		
		friends = friends % 5;	//get remainder of the division
		System.out.println("You have " + friends + " friends.");
		
		friends++;	//increment
		System.out.println("You have " + friends + " friends.");
		
		friends--;	//decrement
		System.out.println("You have " + friends + " friends.");
		
		freind = (double) friends / 3;	//casting integer to double to get decimal value
		System.out.println("You have " + freind + " friends.");
		
	}
}
