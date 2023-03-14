package com.TestMathClass.mypackage;

import java.util.Scanner;

public class TestMathClass {

	public static void main(String[] args) {
		
		double w = 64;
		double x = 3.14;
		double y = -10;
		
		//max between the 2
		double z = Math.max(x, y);
		System.out.println("max is = " + z);
		
		//min between the 2
		z = Math.min(x, y);
		System.out.println("min is = " + z);
		
		//abs
		z = Math.abs(y);
		System.out.println("abs of y is = " + z);
		
		//sqrt
		z = Math.sqrt(w);
		System.out.println("sqrt of w is = " + z);
		
		//round
		z = Math.round(x);
		System.out.println("round of x is = " + z);
		
		//ceil
		z = Math.ceil(x);
		System.out.println("ceil of x is = " + z);
		
		//floor
		z = Math.floor(x);
		System.out.println("floor of x is = " + z + "\n\n");
		
/*find hypotenus*/
		double a,b,c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side of a :");
		a = scanner.nextDouble();
		System.out.println("Enter side of b :");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		System.out.println("value of c :" + c);
		
		scanner.close();
	}

}
