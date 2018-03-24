package TestSwing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class moon  {
    private static  double moon_X;
    private static  double moon_Y;
    private Image moon;
    private double speed=25;
    private double degree=0.6;
    
      
	   private double longx;
	   private double shorty;
	   public moon(String path,double l,double s) {
		  this.moon=new ImageIcon(path).getImage();  
		   longx=l;
		  shorty=s;
		  moon_X=Earth.getEarth_X();
		  moon_Y=Earth.getEarth_Y();
	   }
	   public void draw(Graphics g) {
		   g.setColor(Color.ORANGE);
		    g.drawImage(moon, (int)moon_X, (int)moon_Y, null);
		   //g.drawImage(moon, 50, 50, null);
		 //   g.drawRect(220+, 150,(int)(2*this.longx),(int)(2*this.shorty));
g.drawOval((int)(Earth.getEarth_X()-this.speed+this.moon.getWidth(null)/2), (int)(Earth.getEarth_Y()-this.speed+this.moon.getHeight(null)/2),(int)(2*speed),(int)(2*this.speed));
		   moon_X=Earth.getEarth_X()+this.speed*Math.cos(degree);
		   moon_Y=Earth.getEarth_Y()+this.speed*Math.sin(degree);
		   degree-=0.1;
		    
	   }
}