package mouseListenerTest;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener{

	JLabel label;
	ImageIcon blush;
	ImageIcon nervous;
	ImageIcon sick;
	ImageIcon wink;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		label = new JLabel();
		label.addMouseListener(this);
		
		blush = new ImageIcon("blush.png");
		nervous = new ImageIcon("nervous.png");
		sick = new ImageIcon("sick.png");
		wink = new ImageIcon("wink.png");
		
		label.setIcon(wink);
		
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// invoked when the mouse button has been clicked (pressed and release) on a component
		//System.out.println("You clicked the mouse");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// invoked when a mouse has been pressed on a component
		//System.out.println("You pressed the mouse");
		label.setIcon(sick);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// invoked when a mouse button has been released on a component
		//System.out.println("You released the mouse");
		label.setIcon(nervous);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// invoked when the mouse enters a component
		//System.out.println("You entered the component");
		label.setIcon(blush);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// invoked when the mouse exits a component
		//System.out.println("You exit the component");
		label.setIcon(wink);
	}
	
	
}
