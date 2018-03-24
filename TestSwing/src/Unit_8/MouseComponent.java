package Unit_8;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;

import javax.swing.*;

public class MouseComponent extends JComponent {
	private static final int SIDE=10;
	private ArrayList <Rectangle2D> squares;
    private Rectangle2D now;
    public MouseComponent() {
    	squares=new ArrayList <Rectangle2D>();
    	now=null;
    	addMouseListener(new MouseHandler());
    	addMouseMotionListener(new MouseMotionhandler());
    }
    
    public void paintComponent(Graphics g) {
    	Graphics2D g2=(Graphics2D) g;
    	for(Rectangle2D r:squares)
    		g2.draw(r);
    	
    }
    //点击鼠标
    private class MouseHandler extends MouseAdapter{ //内部类
     @Override
     public void mousePressed(MouseEvent mouseevent) {   //按住鼠标
    	 MouseComponent.this.now=MouseComponent.this.find(mouseevent.getPoint());//有的话就选中为当前
    	 if(now==null) add(mouseevent.getPoint());  //没有就加上 
    	 System.out.println("Mouse Pressed");
     }	
    
    @Override 
     public void mouseClicked(MouseEvent mouseevent) {
    	now=find(mouseevent.getPoint());
    	if(now!=null&&mouseevent.getClickCount()>=2) removed(now);
    }
    }//内部类结束
    private class MouseMotionhandler implements MouseMotionListener{ 
    	//必须重写  public void mouseDragged(MouseEvent e);
    	//必须重写  public void mouseMoved(MouseEvent e);
    	@Override   
    	public void mouseMoved(MouseEvent e) {  //鼠标移动
    		if(find(e.getPoint())==null)  MouseComponent.this.setCursor(Cursor.getDefaultCursor());
    		else
    			MouseComponent.this.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));	
    	}

		@Override
		public void mouseDragged(MouseEvent e) { //鼠标拖拽
			if(now!=null) {
				int x=e.getX();
				int y=e.getY();
				now.setFrame(x-SIDE/2,y-SIDE/2,SIDE,SIDE);
				System.out.println("mouseDragged!");
				repaint();
			}
			
		}
    }
    
    //先查找
    public Rectangle2D find(Point2D p) {
    	for(Rectangle2D r:squares) {
    		if(r.contains(p)) return r;
    	}
    	return null;
    }
    
    //添加
    public void add(Point2D p) {
         	double x=p.getX();
         	double y=p.getY();
         	this.now=new Rectangle2D.Double(x-SIDE/2,y-SIDE/2,SIDE,SIDE);
         	squares.add(now);
         	repaint();
    }
    //删除
    public void removed(Rectangle2D g) {
    	if(g==null) return;
    	if(g==now) now=null;
    	squares.remove(g);
    	repaint();
    }
    

   
}
