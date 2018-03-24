package Unit_8;

import java.awt.Color;


import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ButtonTest2 {
	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame j=new ButtonFrame2();
				j.setLayout(null);//默认的是撑满；
				j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
				//Image image=new ImageIcon("sun.jpg").getImage();
				
			}
			
		});
		
	}
}

class ButtonFrame2 extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8286065131103132885L;
	private JPanel button;
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=200;
	public void makeButton(String name,final Color x) {
		JButton b=new JButton(name);
		button.add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setBackground(x);
			}
		});
	}	
	public ButtonFrame2() {
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		this.setVisible(true);
		this.setTitle("ButtonTest2");
		Image image=new ImageIcon("sun.jpg").getImage();
		this.setIconImage(image);
		this.setLocation(100, 100);
		button=new JPanel();
		button.setSize(300,200);
		this.makeButton("Black", Color.BLACK);
		this.makeButton("Pink", Color.PINK);
		this.makeButton("Red", Color.red);
		this.add(button);
	}
	
}