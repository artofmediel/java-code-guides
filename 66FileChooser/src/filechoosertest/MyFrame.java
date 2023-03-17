package filechoosertest;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

	JButton button;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Select a file");
		button.addActionListener(this);

		this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			
			JFileChooser fileChooser = new JFileChooser();
			//setting default directory
			//fileChooser.setCurrentDirectory(new File("."));
			fileChooser.setCurrentDirectory(new File("C:\\Users\\Sohee\\Desktop"));
			
			
			//int response = fileChooser.showOpenDialog(null);	//select file to open ; returns int value of 0 if you open something, 1 if you cancel
			int response = fileChooser.showSaveDialog(null);	//select file to save
			
			if(response == JFileChooser.APPROVE_OPTION) {
				File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		
		}
		
	}
}
