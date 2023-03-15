package com.variableScopes.mypackage;

import java.util.Random;

public class DiceRoller {
	
	//global 
	Random random;
	int number;
	
	DiceRoller(){
		//local
		/*Random random=new Random();
		 *int number = 0;
		 */
		random = new Random();
		roll();
	}
	
	void roll(){
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
	
	
}
