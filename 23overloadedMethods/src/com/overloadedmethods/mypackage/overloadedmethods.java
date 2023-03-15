package com.overloadedmethods.mypackage;

public class overloadedmethods {

	public static void main(String[] args) {
		
		//overloaded methods- methods that share the same name but have different parameters
		//						methods name + parameters = methods signature
		
		//test and display
		int x = add(1,2);
		System.out.println(x);
		
		double x1 = add(1.0,2.0);
		System.out.println(x1);
		
		int y = add(1,2,3);
		System.out.println(y);

		double y1 = add(1.0,2.0,3.0);
		System.out.println(y1);
		
		int z = add(1,2,3,4);
		System.out.println(z);

		double z1 = add(1.0,2.0,3.0,4.0);
		System.out.println(z1);
		
	}
	
	static int add(int a, int b) {
		System.out.println("this is overloaded method 1");
		return a+b;	
	}
	
	static int add(int a, int b, int c) {
		System.out.println("this is overloaded method 2");
		return a+b+c;	
	}

	static int add(int a, int b,int c, int d) {
		System.out.println("this is overloaded method 3");
		return a+b+c+d;	
	}
	
	//-----------------------------------------------------
	
	static double add(double a, double b) {
		System.out.println("this is overloaded method 4");
		return a+b;	
	}
	
	static double add(double a, double b, double c) {
		System.out.println("this is overloaded method 5");
		return a+b+c;	
	}

	static double add(double a, double b,double c, double d) {
		System.out.println("this is overloaded method 6");
		return a+b+c+d;	
	}
}
