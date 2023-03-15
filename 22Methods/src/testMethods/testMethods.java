package testMethods;

public class testMethods {

	public static void main(String[] args) {

		//method  = a block of code that is executed whenever it is invoked.
		String name = "wiru";
		int age = 27;
		
		//invoke the method
		//hello();
		hello(name,age);
		
		int x = 13;
		int y = 14;
		
		//invoke the method ; and some variation of display
		int addresult = add(x,y);
		System.out.println(addresult);
		System.out.println(add(x,y));
	}
	
	//creating a method hello that print with parameters strings and integer
	static void hello(String name, int age) {
		System.out.println("Hello " + name);
		System.out.println("you are " + age + "?");
	}
	
	//create an add method
	static int add(int x, int y) {
		int z = x+y;
		return z;
		
		//or it could be simplified to
		//return x + y;
	}

}
