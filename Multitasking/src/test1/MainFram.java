package test1;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFram {
	public static void main(String []args) {
		Frame frame=new TestFrame();
		frame.setVisible(true);
		
	}

}
class TestFrame extends JFrame{
	private Ballcomponent comp;
	public static int steps=1000;
	public static int delay=3;
	public TestFrame() {
		setTitle("TestFrame");
		
		this.comp=new Ballcomponent();
		this.add(comp,BorderLayout.CENTER);
		
		JPanel buttonPanel=new JPanel();
		addButton(comp, "Start", new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				addBall();
				
			}
		});
		addButton(comp, "Close", new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
				
			}
		});
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
	}
	public void  addButton(Container c,String name,ActionListener l) {
		JButton button =new JButton(name);
		c.add(button);
		button.addActionListener(l);
		
	}
	public void addBall() {
		try
		{Ball ball=new Ball();
		comp.add(ball);
		for(int i=1;i<=steps;i++) {
			ball.move(bounds().getBounds());
			comp.paint(comp.getGraphics());
			Thread.sleep(delay);
		}
	}
		catch(InterruptedException e) {
			
		}
	}
}