package U9_9_6;

import javax.swing.JFrame;

public class MyJFrame extends JFrame{
	public MyJFrame(String title,int width,int height) {
		this.setTitle(title);
		this.setSize(width, height);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
