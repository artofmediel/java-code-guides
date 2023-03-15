package com.nestedlooptest.mypackage;

import java.util.Scanner;

public class nestedlooptest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter # of rows :");
		rows = scanner.nextInt();
		System.out.println("Enter # of columns :");
		columns = scanner.nextInt();
		System.out.println("Enter symbol to use :");
		symbol = scanner.next();
		
		//test
		for(int x=1;x<=rows;x++) {
			System.out.println();
			for(int y=1;y<=columns;y++) {
				System.out.print(symbol + " ");
			}
		}
		
		scanner.close();
	}

}
