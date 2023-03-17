package com.joptionpaneTest.mypackage;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class joptionpaneTest {

	public static void main(String[] args) {

		// Joptionpane = pop up a standard dialog box that prompts users for a value
		//				or informs them of something
		
		//showMessageDialog
		//JOptionPane.showMessageDialog(null,"plain wiru","goldnugget title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null,"information wiru","goldnugget title", JOptionPane.INFORMATON_MESSAGE);
		//JOptionPane.showMessageDialog(null,"question wiru","goldnugget title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"warning wiru","goldnugget title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null,"error wiru","goldnugget title", JOptionPane.ERROR_MESSAGE);
		
		
		//showConfirmDialog
		//JOptionPane.showConfirmDialog(null,"question?","this is my title", JOptionPane.YES_NO_CANCEL_OPTION );
		//System.out.println(JOptionPane.showConfirmDialog(null,"question?","this is my title", JOptionPane.YES_NO_CANCEL_OPTION ));
		//int answer = JOptionPane.showConfirmDialog(null,"question?","this is my title", JOptionPane.YES_NO_CANCEL_OPTION );
		
		//showInputDialog
		//String name = JOptionPane.showInputDialog("what is your name?");
		//System.out.println("Hello "+ name);
		
		//showOOptionDialog
		String[] responses = {"response A", "response B", "response C"};
		
		ImageIcon icon = new ImageIcon("logo.png");
		
		JOptionPane.showOptionDialog(null,
				"awesome", 
				"secret message", 
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				icon, 
				responses, 
				0);
		
	}

}
