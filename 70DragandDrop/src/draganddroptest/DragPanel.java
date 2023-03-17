package draganddroptest;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class DragPanel extends JPanel{
	
	ImageIcon image = new ImageIcon("wink.png");
	final int WIDTH = image.getIconWidth();
	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point prevPt;
	
	
	DragPanel(){
		imageCorner = new Point(0,0);
		ClickListener clicklistener = new ClickListener();
		DragListener draglistener = new DragListener();
		this.addMouseListener(clicklistener);
		this.addMouseMotionListener(draglistener);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
	}
	
	private class ClickListener extends MouseAdapter{
		
		public void mousePressed(MouseEvent e) {
			prevPt = e.getPoint();
		}
	}
	
	private class DragListener extends MouseMotionAdapter{
		
		public void mouseDragged(MouseEvent e) {
			Point currentPoint = e.getPoint();
			
			imageCorner.translate(
					(int)currentPoint.getX() - (int)prevPt.getX(), 
					(int)currentPoint.getY() - (int)prevPt.getY()
					);
			prevPt = currentPoint;
			repaint();
		}
	}
	
}
