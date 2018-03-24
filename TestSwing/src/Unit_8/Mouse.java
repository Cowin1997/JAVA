package Unit_8;

import javax.swing.JFrame;

public class Mouse extends JFrame{
	public Mouse() {
		this.setSize(300,300);
		this.setLocation(100, 100);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MouseComponent());
	}
	public static void main(String []args) {
		JFrame f=new Mouse();
	}

}


