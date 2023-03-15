package testArrayList;

import java.util.ArrayList;

public class testArrayList {

	public static void main(String[] args) {
		
		// ArrayList = 	a resizable array
		//				elements can be added and removed after compilation phase
		// 				store reference data types
		
		ArrayList<String> food = new ArrayList<String>(); 
		//ArrayList<Integer> cellphonenumber = new ArrayList<Integer>(); 
		//the data type used should be wrapper class.
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		//to set value on certain index
		food.set(0, "sushi");
		
		//to remove certain item on the array
		food.remove(2);
		
		//to clear all items on the arraylist
		food.clear();
		
		//to display
		for(int a=0;a<food.size();a++) {
			System.out.println(food.get(a));
		}
		
		
	}

}
