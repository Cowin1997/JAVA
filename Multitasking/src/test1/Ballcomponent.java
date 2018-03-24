package test1;



import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Ballcomponent extends JPanel{
	private static final int DEFAULT_W=450;
	private static final int DEFAULT_H=350;
	
	private java.util.List<Ball>balls=new ArrayList<>();
	
	public void add(Ball b) {
		balls.add(b);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D)g;
		for(Ball b:balls) {
			g2.fill(b.getShape());
		}
	}
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_W, DEFAULT_H);
	}
	}
