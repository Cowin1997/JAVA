package TestSwing;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class TestImage {
	public static void main(String []args) {
	//	EventQueue.invokeLater(new Runnable() {
		//	public void run() {
				JFrame j=new ImageFrame();
				j.setVisible(true);
				j.setLocation(100,100);
				j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				j.setTitle("测试图片");
			 //   j.setSize(50,50);
//}
	//	}
	//);
	
}//main
}//class


//窗口
class ImageFrame extends JFrame{
	public ImageFrame() {
		add(new ImageComponent("sun.jpg"));
	//	add(new ImageComponent("233.jpg"));
		pack();
	}
	
}

//组件
class ImageComponent extends Component{
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=200;
	private Image image;
	public ImageComponent(String path) {
		image=new ImageIcon(path).getImage();
	}
	public ImageComponent() {}
	public void paint(Graphics g) {
		if(image==null) {System.out.println("Image is null");return;}
		int imagewidth=image.getWidth(null);
		int imageheight=image.getHeight(this);
		g.drawImage(image,0,0,null);
		System.out.println("imagewidth:"+imagewidth);
		System.out.println("imageheight:"+imageheight);
		System.out.println("getWidth():"+getWidth());
		System.out.println("getHeight():"+getHeight());
		for(int i=0;i*imagewidth<this.getWidth();i++)
			for(int j=0;j*imageheight<getHeight();j++)
				if(i+j>0) g.copyArea(0, 0, imagewidth, imageheight, imagewidth*i, imageheight*j);
	}
	public  Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH,DEFAULT_HEIGHT);
	}

					
			
	
	
	
}