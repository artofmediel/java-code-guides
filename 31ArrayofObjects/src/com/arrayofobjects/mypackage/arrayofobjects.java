package com.arrayofobjects.mypackage;

public class arrayofobjects {

	public static void main(String[] args) {

		//make the array of object
		//Food[] refrigerator = new Food[3];
		
		//input data
		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburger");
		Food food3 = new Food("hotdog");
		
		//store in objects in the array
		//refrigerator[0] = food1;
		//refrigerator[1] = food2;
		//refrigerator[2] = food3;
		
		//could also make the array declaration like this and store the data at the same time
		Food[] refrigerator = {food1,food2,food3};
				
		
		//display
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
	}

}
