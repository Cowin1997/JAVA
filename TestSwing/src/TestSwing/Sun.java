package TestSwing;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Sun {
	private static final double SUN_X=220;
		
	private static final double SUN_Y=220;
	private static  Image SunImage=null;
	public Sun(String path) {
		this.SunImage=new ImageIcon(path).getImage();
	}
    public void draw(Graphics g) {
    	g.drawImage(this.SunImage,(int)(this.SUN_X-8),(int)this.SUN_Y-8,null);
    //	System.out.println(SunImage.getWidth(null)+"**"+SunImage.getHeight(null));
    }
    public static double getSUN_X() {
    	return (SUN_X);
    }  
    public static double getSUN_Y() {
    	return (SUN_Y);
    }
	}
