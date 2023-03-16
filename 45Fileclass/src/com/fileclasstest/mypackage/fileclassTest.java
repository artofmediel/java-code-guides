package com.fileclasstest.mypackage;

import java.io.File;

public class fileclassTest {

	public static void main(String[] args) {
		
		//file - an abstract representation if file and directory pathnames
		
		//within the project folder
		File file = new File("file_class_test.txt");
		
		//out of the project folder
		//File file = new File("C:/Users/Sohee/Desktop/eclipse_files/file_class_test.txt");
		
		
		if(file.exists()) {
			System.out.println("That file exist");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete(); //this deletes the file that is on the project folder.<<< 
		} else {
			System.out.println("File not found");
		}
		
		
	}

}
