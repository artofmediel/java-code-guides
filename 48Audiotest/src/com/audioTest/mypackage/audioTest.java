package com.audioTest.mypackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;


public class audioTest {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException{

		Scanner scanner= new Scanner(System.in);
		
		File file = new File("sample.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		
		//---------------------------------------------------------------------
		String response = "";
		
		while (!response.equals("Q")) {
			System.out.println("[P] = play, [S] = stop, [R] = reset, [Q] = quit");
			System.out.print("Enter choice:");
			
			response = scanner.next();
			response = response.toUpperCase(); //keeps input to uppercase
			
			switch(response) {
				case("P"):	clip.start();
				break;
				case("S"):	clip.stop();
				break;
				case("R"):	clip.setMicrosecondPosition(0);
				break;
				case("Q"):	clip.close();
				break;
				default: System.out.println("Not a valid choice.");
			}
		}
		
		System.out.println("exited app");
		scanner.close();
	}

}
