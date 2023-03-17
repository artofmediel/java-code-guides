package com.panelsTest.mypackage;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panelsTest {

	public static void main(String[] args) {
		
		//jPanel = a GUI component that functions as a container to hold other components
		ImageIcon icon = new ImageIcon("thumbsup.png");
		
		JLabel label = new JLabel();
		label.setText("HI");
		label.setIcon(icon);
		//label.setVerticalAlignment(JLabel.BOTTOM);
		//label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(100, 100, 75, 75);
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(null);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		redPanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		redPanel.setLayout(null);
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		
		//add components
		greenPanel.add(label);
		
		//add panels / containers
		frame.add(redPanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
	}

}
