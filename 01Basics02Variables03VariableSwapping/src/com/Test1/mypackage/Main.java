package com.Test1.mypackage;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/**PRINTS**/
		System.out.print("PRINTS\n\n");
		
		System.out.print("wiru0");				//just print
		System.out.print("wiru1\n");			//print with escape-sequence
		System.out.println("wiru2\n");  		//print line + esc-seq
		System.out.println("\twiru3");			//tabs
		System.out.println("\"wiru4\"");		//quotes
		System.out.println("\\wiru5\\");	//backslash
		
		//shortcut key type sysout then press ctrl+space
		//zoom out = ctrl+minuskey vice versa for zoom in
		
		/**https://www.youtube.com/watch?v=xk4_1vDrzzo**/
		//comment1
		/*comment2
		 *comment2
		 *comment2
		 */
		
		
/**VARIABLES**/
		System.out.print("\n\n\nVARIABLES\n\n");
		int a; 		 //declaration
		a = 123; 	 //assignment
		int b = 321; //initialization
		
		System.out.println("a is " + a + "\nb is " + b);
		
		long c= 1137148128694891L;	//put L at the end
		System.out.println(c);
		
		double d = 100.22;		
		float e = 3.14f;		//put f at the end
		
		boolean f= true;		//or false
		System.out.println("d = " + d + "\ne = " + e + "\nf is = " + f);
		
		char g = '@';
		
		String h = "wiru";
		
		System.out.println("Hello " + g + h);
		
		
/**VARIABLE SWAP**/
		System.out.print("\n\n\nVARIABLE SWAP\n\n");
		
		String x_str= "water";
		String y_str= "kool-aid";

		System.out.println("x = " + x_str);
		System.out.println("y = " + y_str);
		
		String temp_str;
		
		temp_str=x_str;
		x_str=y_str;
		y_str=temp_str;
		
		System.out.println("x after swap = " + x_str);
		System.out.println("y after swap = " + y_str);
	}

}
