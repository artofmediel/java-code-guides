package com.testRandValues.mypackage;
import java.util.Random;

public class testRandomValues {

	public static void main(String[] args) {
		
		Random  random = new Random();
		
		//example dice roll
		int x = random.nextInt(6)+1; 
		System.out.println(x);
		
		double y = random.nextDouble(123.02);
		System.out.println(y);
		
		boolean z = random.nextBoolean();
		System.out.println(z);
		
	}

}
