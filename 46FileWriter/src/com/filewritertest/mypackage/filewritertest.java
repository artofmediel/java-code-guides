package com.filewritertest.mypackage;

import java.io.FileWriter;
import java.io.IOException;

public class filewritertest {

	public static void main(String[] args) {
			
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Rosed are red \nViolets are blue\nYou thought this was a poem\nBut it was me DIO!");
			writer.append("\n-wiru");
			writer.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
