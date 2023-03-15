package testStringMethods;

public class testStringMethods {

	public static void main(String[] args) {

		
		String name = "William";
		
		boolean result1 = name.equals("william");
		System.out.println(result1);
		
		boolean result2 = name.equalsIgnoreCase("william");
		System.out.println(result2);
		
		int result3 = name.length();
		System.out.println(result3);
		
		char result4 = name.charAt(0);
		System.out.println(result4);
		
		int result5 = name.indexOf("a");
		System.out.println(result5);
		
		boolean result6 = name.isEmpty();
		System.out.println(result6);
		
		String result7 = name.toUpperCase();
		System.out.println(result7);
		
		String result8 = name.toLowerCase();
		System.out.println(result8);
		
		String name2 ="      wiru   ";
		String result9 = name2.trim();
		System.out.println(result9);
		
		String result10 = name.replace('i', 'o');
		System.out.println(result10);
		
		
	}

}
