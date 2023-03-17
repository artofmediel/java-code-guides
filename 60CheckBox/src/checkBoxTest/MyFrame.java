package checkBoxTest;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JButton button;
	JCheckBox checkbox;
	
	ImageIcon xIcon, checkIcon;
	
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());

		xIcon = new ImageIcon("nocheck.png");
		checkIcon = new ImageIcon("check.png");
		
		button = new JButton();;
		button.setText("submit");
		button.addActionListener(this);
		
		checkbox = new JCheckBox();
		checkbox.setText("I'm not a robot");
		checkbox.setFocusable(false);
		checkbox.setFont(new Font("Consolas",Font.PLAIN,35));
		checkbox.setIcon(xIcon);
		checkbox.setSelectedIcon(checkIcon);
		
		this.add(button);
		this.add(checkbox);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			System.out.println(checkbox.isSelected()); 
		}
	}

}
