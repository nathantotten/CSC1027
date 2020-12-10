package week7;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class PaintDemo extends JFrame implements MouseMotionListener {

	public PaintDemo(String text) {
		super(text);
		this.setSize(500,500);
		this.setVisible(true);
		addMouseMotionListener(this);
	}
	
	public static void main(String[] args) {
		new PaintDemo("Paint App");

	}
	

	@Override
	public void mouseDragged(MouseEvent me) {
		// TODO Auto-generated method stub
		Graphics g = this.getGraphics();
		g.setColor(Color.RED);
		g.drawOval(me.getX(), me.getY(), 10, 10);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
