package TestSwing;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class TestFont {
	public static void main(String[]args){
	EventQueue.invokeLater(new Runnable() {
		
	public void run() {
	JFrame f=new FontFrame();
	f.setTitle("FontTest");
	f.setVisible(true);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	});
	}
	

}
class FontFrame extends JFrame{
	public FontFrame() {
		add(new FontComponent());
		pack();
	}
}

class FontComponent extends Component{
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=200;
	
	public void paint(Graphics g) {
		Graphics2D g2=(Graphics2D)g;
		String message="Hello,World!";
		Font f=new Font("宋体",Font.BOLD,36);
		g2.setFont(f);
		FontRenderContext context=g2.getFontRenderContext();
		Rectangle2D bounds=f.getStringBounds(message, context);
		
		
		double x=(getWidth()-bounds.getWidth())/2;
		double y=(getHeight()-bounds.getHeight())/2;
		
		double ascent=-bounds.getY();
		System.out.println("bounds.getY():"+bounds.getY());
		double baseY=y+ascent;
		
		g2.drawString(message, (int)x,(int) baseY);//drawString(String s,int x,int y) x,y是基线起点在位置
		g2.setPaint(Color.LIGHT_GRAY);
		g2.draw(new Line2D.Double(x,baseY,x+bounds.getWidth(),baseY));
		Rectangle2D rect=new Rectangle2D.Double(x,y,bounds.getWidth(),bounds.getHeight());
		g2.draw(rect);
		
	}
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}
		
		
	}
