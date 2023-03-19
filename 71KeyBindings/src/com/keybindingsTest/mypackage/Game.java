package com.keybindingsTest.mypackage;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Game {
	
	JFrame frame;
	JLabel label;
	
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	
	Game(){
		
		frame = new JFrame("Keybind demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100,100,100,100);
		label.setOpaque(true);
		
		upAction = new UpAction();
		downAction = new DownAction();
		leftAction = new LeftAction();
		rightAction = new RightAction();
		
		//ARROW KEYS ------------------------------------------------------------
		/*label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
		label.getActionMap().put("upAction", upAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
		label.getActionMap().put("downAction", downAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		*/
		
		//WSAD KEYS -------------------------------------------------------------
		label.getInputMap().put(KeyStroke.getKeyStroke('w'), "upAction");
		label.getActionMap().put("upAction", upAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke('s'), "downAction");
		label.getActionMap().put("downAction", downAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke('a'), "leftAction");
		label.getActionMap().put("leftAction", leftAction);
		
		label.getInputMap().put(KeyStroke.getKeyStroke('d'), "rightAction");
		label.getActionMap().put("rightAction", rightAction);
		
		frame.add(label);
		frame.setVisible(true);
	}
	
	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(),label.getY()-10);
			
		}
		
	}
	
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX(),label.getY()+10);
			
		}
		
	}
	
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()-10,label.getY());
			
		}
		
	}
	
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			label.setLocation(label.getX()+10,label.getY());
			
		}
		
	}
}
