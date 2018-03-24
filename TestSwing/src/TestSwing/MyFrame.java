package TestSwing;

import java.awt.*;

import javax.swing.*;

public class MyFrame extends JFrame {
	public MyFrame() {
		Toolkit kit = Toolkit.getDefaultToolkit();// public static synchronized Toolkit getDefaultToolkit(){}
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		setSize(screenWidth / 2, screenHeight / 2);
		setLocationByPlatform(true);
		Image img = new ImageIcon("233.jpg").getImage();
		setIconImage(img);
	}

	/**
	 * main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { // public static void invokeLater(Runnable runnable) {
			public void run() {
				JFrame frame = new MyFrame();
				frame.setTitle("SizeFrame Window!");
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
		});
	}
}
