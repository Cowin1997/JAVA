package U9_9_5;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InputImage extends JFrame{
	private Image img=new ImageIcon("123.gif").getImage();
	JPanel j=new mycomponent();
	public InputImage() {
	 
		this.setSize(500,500);
		this.setLocation(100, 100);
		
		this.add(j);
	
	}
    class mycomponent extends JPanel{
    	public void  paintComponent(Graphics g) {
    		g.drawImage(img,100,100,this);
    	}
    	
    }
    public static void main(String[]args) {
    	JFrame frame=new InputImage();
    	frame.setVisible(true);
    }
}
