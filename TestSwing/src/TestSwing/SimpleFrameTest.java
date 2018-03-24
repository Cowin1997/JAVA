package TestSwing;

import java.awt.*;

import javax.swing.*;

public class SimpleFrameTest {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			/**
			 * public static void invokeLater(Runnable runnable) {..} //EventQueue.class
			 * 
			 * public abstract void run(); //Runnable class
			 */ 
			public void run() {
				SimpleFrame frame = new SimpleFrame();
			//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// extends from JFrame
				frame.setVisible(true);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// extends from JFrame
				/**
				 * window.class::
				 * 
				 * public void setVisible(boolean b) { super.setVisible(b); }
				 * 
				 */

			}
		});
	}

}

class SimpleFrame extends JFrame {
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;

	public SimpleFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);// SimpleFrame extends JFrame extends window
		// setSize 是从window类中继承过来的 ： public void setSize(int width, int height){ 。。。}
		setTitle("SimpleFrame窗口");
	}
}
