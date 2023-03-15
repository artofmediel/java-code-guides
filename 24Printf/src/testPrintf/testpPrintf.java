package testPrintf;

public class testpPrintf {

	public static void main(String[] args) {
		
		//printf = optional method to control, format, and display text to the console window
		//			2 arguments = format string + (object/variable/value)
		//			% [flags] [precision] [width] [conversion-character]
		
		
		System.out.printf("%d This is a format string \n", 123);
		
		//test
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "wiru";
		int myInt = 50;
		double myDouble = 1000;
		double myDouble2 = -1000;
		
		//[conversion-character]
		System.out.printf("%b \n", myBoolean);
		System.out.printf("%c \n", myChar);
		System.out.printf("%s \n", myString);
		System.out.printf("%d \n", myInt);
		System.out.printf("%f \n", myDouble);
		
		//[width]
		//minimum number of characters to be written as output
		System.out.printf("Hello %-8s \n", myString);
		System.out.printf("Hello %8s \n", myString);
		
		//[precision]
		//add an effect to output based on the flag added to format specifier
		System.out.printf("You have this much money %.2f \n", myDouble);
		
		//[flags]
		// - : left justify
		// + : output a plus ( + ) or minus ( - ) sign for a numeric value
		// 0 : numeric values are zero-padded
		// , :: comma grouping separator if number > 1000
		
		System.out.printf("You have this much money %-20f \n", myDouble);
		System.out.printf("You have this much money %020f \n", myDouble2);
		System.out.printf("You have this much money %,f \n", myDouble);
		
		
	}

}
