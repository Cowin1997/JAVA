package TestSwing;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class MyselfFrame {
	public static void main(String []args) {
		GameFrame gframe=new GameFrame();
		gframe.launchFrame();
		//gframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gframe.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
			    System.exit(0);
			   }
			  });
		gframe.setVisible(true);
	}
  
}
class GameFrame extends Frame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7871728679098007479L;
    private static double x=50;
    private static double y=50;
    private static boolean r=true;
 


	public void launchFrame(){
		setSize(350,350);
		setLocation(400,100);
		//setVisible(true);
		setTitle("游戏测试窗口");
		new paintrefresh().start();
		
	}
	@Override
	public void paint(Graphics g) {
		g.setColor(Color.green);
	//	  g.drawLine(200, 200, 300, 300);
		  Color c=g.getColor();
		 // System.out.println("111");
		Font f=new Font("宋体",Font.CENTER_BASELINE,20);
		g.setFont(f);
		g.drawString("TestString", 350, 350);
	 Image img=getToolkit().getImage("sun.jpg");
		g.drawImage(img, (int) x, (int)y, null);
		if(x>300) r=false;
	    if(r) x++;
	    else
	    	x--;
	    if(!r&&x<50) 
			r=true;
	    
 		//repaint();
	}
	
	

class paintrefresh extends Thread{
	public void run() {
		while(true) {
			repaint();
			//update();
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		}
		
	}
	
}

}