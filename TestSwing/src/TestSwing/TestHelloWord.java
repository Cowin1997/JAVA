package TestSwing;

import java.awt.*;

import javax.swing.*;

public class TestHelloWord {
	

	public static void main(String[]args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				JFrame frame=new HelloWorldFrame();
				frame.setTitle("HelloWorld");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
  
	
	}

}


class HelloWorldFrame extends JFrame{
	public HelloWorldFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();// public static synchronized Toolkit getDefaultToolkit(){}
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		//setSize(screenWidth / 2, screenHeight / 2);
		setLocationByPlatform(true);
		Image img = new ImageIcon("E:\\JAVA\\TestSwing\233.jpg").getImage();
		setIconImage(img);
	
 
		//setSize(300,800);
		add(new HelloWorldComponent());
		pack();
	}
	
}
class HelloWorldComponent extends JComponent{
	private static final int MESSAGE_X=75;
	private static final int MESSAGE_Y=100;
	private static final int DEFAULT_WIDTH=400;
	private static final int DEFAULT_HEIGHT=400;
	
	
	public void paintComponent(Graphics g) {
		g.drawString("HelloWorld", MESSAGE_X, MESSAGE_Y);
	}
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	
	}
	
}