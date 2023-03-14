package basicGUI;
import javax.swing.JOptionPane;

public class basicGUI {

	public static void main(String[] args) {
		
		//string
		String name = JOptionPane.showInputDialog("Enter your name: ");
		JOptionPane.showMessageDialog(null, "Hello " + name);
	
		//integer
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
		JOptionPane.showMessageDialog(null, "You are " + age + " years old");
		
		//double
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
		JOptionPane.showMessageDialog(null, "You are " + height + "cm tall");
		
	}

}
