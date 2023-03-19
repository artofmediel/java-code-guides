package testGenerics;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	//GENERIC METHOD -----------------------------------------------------------------------
	
		/*public static void main(String[] args) {
		*	
		*	//generics =  enable types(classes and interfaces) to be parameters when defining:
		*	//				classes, interfaces and methods
		*	//				a benefit is to eliminate the need to create multiple versions
		*	//				of methods or classes for various data types
		*	//				Use 1 version for all reference data types
		*	
		*	Integer[] intArray = {1, 2, 3, 4, 5};
		*	Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		*	Character[] charArray = {'W','I','R','U'};
		*	String[] stringArray = {"B","Y","E"};
		*	
		*	displayArray(intArray);
		*	displayArray(doubleArray);
		*	displayArray(charArray);
		*	displayArray(stringArray);
		*	
		*	System.out.println(getFirst(intArray));
		*	System.out.println(getFirst(doubleArray));
		*	System.out.println(getFirst(charArray));
		*	System.out.println(getFirst(stringArray));
		}
		
		//All of these methods basically does the same thing
		/*
		public static void displayArray(Integer[] array) {
			
			for(Integer x: array) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		public static void displayArray(Double[] array) {
			
			for(Double x: array) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		public static void displayArray(Character[] array) {
				
			for(Character x: array) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		
		public static void displayArray(String[] array) {
			
			for(String x: array) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		*/
		
		//To simplify
		/*public static <Thing> void displayArray(Thing[] array) {	//<T> is common practice but it means <Thing>
		*	
		*	for(Thing x: array) {
		*		System.out.print(x+" ");
		*	}
		*	System.out.println();
		*}
		*
		*/
	
		//another example but it returns something
		/*public static <Thing> Thing getFirst(Thing[] array) {
		*	return array[0];
		*}
		*
		*/
		
	//---------------------------------------------------------------------------------------
	
		//real world scenario : example , you are making a game
		//and you wanted to draw multiple objects that have different data types
		
		/*public static void main(String args[]) {
			
			Player player = new Player();
			Enemy enemy = new Enemy();
			Item item = new Item();
			Tree tree = new Tree();
		
			draw(player);
			draw(enemy);
			draw(item);
			draw(tree);
		}
		
		public static <Thing> void draw(Thing x) {
			x.draw();
		}
		*/
	
	//GENERIC CLASSES -----------------------------------------------------------------------
	/*public static void main(String args[]) {
	*	
	*	//MyIntegerClass myInt = new MyIntegerClass(1);
	*	//MyDoubleClass myDouble = new MyDoubleClass(3.14);
	*	//MyCharacterClass myChar = new MyCharacterClass('@');
	*	//MyStringClass myString = new MyStringClass("hello");
	*	
	*	//Made 4 separate classes for testing 
	*	//MyIntegerClass.java, MyDoubleClass.java, MyCharacterClass.java, MyStringClass.java
	*	//Refactor them to something else to test the generic class
	*	
	*	//MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
	*	//MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
	*	//MyGenericClass<Character> myChar = new MyGenericClass<>('@');
	*	//MyGenericClass<String> myString = new MyGenericClass<>("hello");
	*	
	*	//the declaration is pretty much the same as you see in what we do with the arraylist
	*	//as the arraylist itself is a generic class
	*	//ArrayList<String> myFriends = new ArrayList<>();
	*	
	*	//EXAMPLE : what if you have 2 parameters to pass
	*	MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,9);
	*	MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,1.01);
	*	MyGenericClass<Character,Character> myChar = new MyGenericClass<>('@','$');
	*	MyGenericClass<String,Character> myString = new MyGenericClass<>("hello",'!');
	*	
	*	//This is very similar to HASHMAP
	*	//hashmap is a collection of key value pairs, and these accept reference data types
	*	HashMap<Integer, String> users = new HashMap<>();
	*	
	*	System.out.println( myInt.getValue() );
	*	System.out.println( myDouble.getValue() );
	*	System.out.println( myChar.getValue() );
	*	System.out.println( myString.getValue() );
	*}
	*/
	
	//BOUNDED TYPES ---------------------------------------------------------------------------
	
	public static void main(String args[]) {
		
	//bounded types =	you can create the objects of a generic class to have data
	//					of specific derived types example : Number
	
		MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(1,9);
		MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,1.01);
		//now that the parameter only accept types within the Number class Character 
		//and String wont work
		//MyGenericClass<Character,Character> myChar = new MyGenericClass<>('@','$');
		//MyGenericClass<String,Character> myString = new MyGenericClass<>("hello",'!');
		
		System.out.println( myInt.getValue() );
		System.out.println( myDouble.getValue() );
		//System.out.println( myChar.getValue() );
		//System.out.println( myString.getValue() );
		
	}
	
}
