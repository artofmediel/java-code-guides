package draganddroptest;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	
	DragPanel dragpanel = new DragPanel();
	
	MyFrame(){

		this.add(dragpanel);
		this.setTitle("Drag and Drop Demo");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
