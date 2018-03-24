package TestSwing;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class DrawTest {
	public static void main(String[]args) {
	EventQueue.invokeLater(new Runnable(){

		@Override
		public void run() {
			// TODO 自动生成的方法存根
		 JFrame frame=new DrawFrame();
		 frame.setTitle("测试简单绘图");
		
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setVisible(true);
		}	
	});

}
}



class DrawFrame extends JFrame{
	public DrawFrame() {
		Image img = new ImageIcon("233.jpg").getImage();
		setIconImage(img);
		add(new DrawComponent());
		//setSize(400,400);
		pack();
	}
}
class DrawComponent extends JComponent{
	private static final int DEFAULT_WIDTH=400;
	private static final int DEFAULT_HEIGHT=400;

	public void paintComponent(Graphics g) {
		Graphics2D g2=(Graphics2D)g;
		//draw rectangle 矩形
		double Leftx=100;
		double Lefty=100;
		double width=200;
		double height=150;
		Rectangle2D rect=new Rectangle2D.Double(Leftx,Lefty,width,height);
		g2.draw(rect);
		//椭圆
		Ellipse2D ellipse=new Ellipse2D.Double();
		ellipse.setFrame(rect);
		g2.draw(ellipse);
		//直线
		g2.draw(new Line2D.Double(Leftx, Lefty, Leftx+width, Lefty+height));
		//圆
		double centerX=rect.getCenterX();
		double centerY=rect.getCenterY();
		double r=160;
		System.out.println(centerX+";"+centerY);
		//Ellipse2D cricle=new Ellipse2D.Double();
		Ellipse2D cricle=new Ellipse2D.Double(centerX-r,centerY-r,2*r,2*r);
	//	cricle.setFrameFromCenter(centerX,centerY,centerX+r,centerY+r);
		g2.draw(cricle);
		//Image img = new ImageIcon("E:\\JAVA\\TestSwing\233.jpg").getImage();
		  Image img=getToolkit().getImage("sun.jpg");
		g2.drawImage(img, 100, 100, null);
		g2.drawImage(img,100,105,null);
		
		
	}
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
	
}