package TestSwing;



import java.awt.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


import javax.swing.ImageIcon;



public class WorldFrameMain {
	public static void main(String[]args) {
		Frame MainFrame=new WorldFrame();
		
		
		
	}

}


class WorldFrame extends Frame{
	private static final Sun sun=new Sun("sun.jpg");
	private static final Earth earth=new Earth("earth.jpg",60.0,60.0);
	private static final moon moon=new moon("moon.jpg",5,5.0);
	
	public WorldFrame() {
		this.setTitle("WorldFrame");
		this.setSize(500, 500);
		this.setLocation(100, 100);
		this.setVisible(true);
		new paintrefresh().start();

		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
			    System.exit(0);
			   }
			  });
        
	}
	
	public void paint(Graphics g) {
	
		sun.draw(g);
		earth.draw(g);
		moon.draw(g);
		
	}
	class paintrefresh extends Thread{
		public void run() {
			while(true) {
				repaint();
			
			try {
				Thread.sleep((int)50);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			}
			
		}
		
	}
		
	
}