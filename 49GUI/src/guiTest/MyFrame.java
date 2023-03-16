package guiTest;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	MyFrame(){
		
		this.setTitle("JFrame title goes here");	//set title of frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//exit out of application
		this.setResizable(false);	//prevent frame from being resized, also prevent full screen
		this.setSize(300, 300);		//set x dimension, set y dimension
		this.setVisible(true);		//make the frame visible
		
		ImageIcon imgicon= new ImageIcon("logo.png"); //create an image icon
		this.setIconImage(imgicon.getImage()); //change icon of frame
		
		this.getContentPane().setBackground(Color.green); 			//change color of background
		
	}
}
