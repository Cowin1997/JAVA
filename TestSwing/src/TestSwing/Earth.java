package TestSwing;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Earth  {
       private static  double EARTH_X;
       private static  double EARTH_Y;
       private Image EarthImage;
       private double speed=60;
       private double degree=0.1;
       
         
	   private double longx;
	   private double shorty;
	   public Earth(String path,double l,double s) {
		  this.EarthImage=new ImageIcon(path).getImage();  
		   longx=l;
		  shorty=s;
		  EARTH_X=Sun.getSUN_X();
		  EARTH_Y=Sun.getSUN_Y();
	   }
	   public void draw(Graphics g) {
		    g.drawImage(EarthImage, (int)this.EARTH_X, (int)this.EARTH_Y, null);
		
 g.drawOval((int)(220-this.longx+this.EarthImage.getWidth(null)/2), (int)(220-this.shorty+this.EarthImage.getHeight(null)/2),(int)(2*this.longx),(int)(2*this.shorty));
		   this.EARTH_X=220+this.speed*Math.cos(degree);
		   this.EARTH_Y=220+this.speed*Math.sin(degree);
		  degree-=0.05;
		    
	   }
	   public static double getEarth_X() {
		   return EARTH_X;
		   
	   }
	   public  static double getEarth_Y() {
		   return EARTH_Y;
	   }
}
