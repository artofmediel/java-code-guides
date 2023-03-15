package com.logicaloperators.mypackage;

import java.util.Scanner;

public class logicaloperators {

	public static void main(String[] args) {

		// AND && - OR || - NOT !
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input temperature :");
		int temp = scanner.nextInt();
		scanner.nextLine();	
		
		if(temp>30) {
			System.out.println("It is hot outside.");
		}
		else if(temp>=20 && temp<=30) {
			System.out.println("It is warm outside.");
		}
		else{
			System.out.println("It is cold outside.");
			
		}
		
		// or
		System.out.println("press [e] ot [E] to exit");
		String exitkey = scanner.nextLine();
		
		if(exitkey.equals("e") || exitkey.equals("E")) {
			System.out.println("done exit");
		} else {
			System.out.println("still here");
		}
		
		
		//and - not
		System.out.println("press [p] or [P] to play");
		String playkey = scanner.nextLine();
		
		if(!playkey.equals("p") && !playkey.equals("P")) {
			System.out.println("not playing");
		} else {
			System.out.println("playing");
		}
		
		
		scanner.close();
	}

}
