package week5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class PaintWin extends JFrame implements MouseMotionListener {

	public PaintWin(String text) {
		super(text);
		this.setSize(500,500);
		this.setVisible(true);
		this.addMouseMotionListener(this);
	}
	
	public static void main(String[] args) {
		new PaintWin("Hello");
	}

	@Override
	public void mouseDragged(MouseEvent me) {
		// TODO Auto-generated method stub
		Graphics g = this.getGraphics();
		g.setColor(Color.RED);
		g.drawOval(me.getX(), me.getY(), 10, 10);
	}

	@Override
	public void mouseMoved(MouseEvent me) {
		
		
	}

}
