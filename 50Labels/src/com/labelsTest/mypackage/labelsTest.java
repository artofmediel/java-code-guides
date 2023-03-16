package com.labelsTest.mypackage;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class labelsTest {

	public static void main(String[] args) {

		//JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("dio.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		
		JLabel label = new JLabel();		//create a label
		label.setText("----KONO DIO DA!----");		//set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);	//set text LEFT,CENTER,RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP);		//set text TOP,CENTER,BOTTOM of imageicon
		label.setForeground(new Color(0xFFFFFF));			//set font color
		label.setFont(new Font("MV Boli",Font.PLAIN,40));	//set font style and size
		label.setIconTextGap(-25);							//set gap of text to image
		label.setBackground(Color.black);					//set background color
		label.setOpaque(true);								//display background color
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);			//set vertical position of icon and text within the label
		label.setHorizontalAlignment(JLabel.CENTER);		//set horizontal position of icon and text within the label
		//label.setBounds(100, 100, 250, 350);				//set x,y position within frame as well as dimensons
		
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(500,500);
		//frame.setLayout(null);
		
		frame.setVisible(true);
		frame.add(label);
		frame.pack();			//add this after adding labels >> frame.add(label);
	}

}
