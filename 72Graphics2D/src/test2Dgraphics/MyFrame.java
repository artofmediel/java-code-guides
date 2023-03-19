package test2Dgraphics;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;

public class MyFrame extends JFrame{

	MyPanel panel;
	
	MyFrame(){
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);	//window spawn in the middle of screen
		this.setVisible(true);
		
	}
	
	
	
}
