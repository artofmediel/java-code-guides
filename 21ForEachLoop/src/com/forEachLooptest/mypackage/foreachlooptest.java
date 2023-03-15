package com.forEachLooptest.mypackage;

import java.util.ArrayList;

public class foreachlooptest {

	public static void main(String[] args) {

		//for-each = traversing technique to iterate through the elements in an 
		//				array/collection 
		//				less steps, more readable
		//				less flexible
		
		
		//testing display
		/*String[] animals = {"cat","dog","hamham","birb"};
		*
		*for(String i: animals) {
		*	System.out.println(i);
		*}
		*/
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("hamham");
		animals.add("birb");
		
		for(String i : animals){
			System.out.println(i);
		}
		
		
	}

}
