package test2;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

import test1.Ball;
import test1.Ballcomponent;

public class bounceThread {
	public static void main(String[]args) {
		JFrame frame=new BounceFrame();
		frame.setVisible(true);
		
	}
}

class BallRunnable implements Runnable{
	private Ball ball;
	private Component component;
	public static int STEPS=1000;
	public static int DELAY=100;
	public BallRunnable(Ball ball,Component c) {
		this.ball=ball;
		this.component=c;
	}
	@Override
	public void run() {
		try {
			for(int i=1;i<=STEPS;i++) {
				ball.move(this.component.getBounds());
				component.repaint();
				Thread.sleep(this.DELAY);
			}
			
		}
		catch(InterruptedException e) {
			
		}
	}
	
}
class BounceFrame extends JFrame{
	private Ballcomponent cBallcomponent;
	public BounceFrame() {
		
		this.cBallcomponent=new Ballcomponent();
	
		JPanel buttonpanel=new JPanel();
		addButton(cBallcomponent, "Start",new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent arg0) {
			   addBall();
			 //  addBall();
			}
		});
		addButton(cBallcomponent, "Close", new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
		add(cBallcomponent,BorderLayout.CENTER);
		add(buttonpanel, BorderLayout.SOUTH);
		this.setSize(500,500);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	}
	public void addButton(Container c,String title,ActionListener l) {
		JButton button=new JButton(title);
		button.addActionListener(l);
		c.add(button);
	}
	public void addBall() {
		Ball ball=new Ball();
		cBallcomponent.add(ball);
		Runnable r=new BallRunnable(ball, cBallcomponent);
		Thread thread=new Thread(r);
		thread.start();
	}
	
}