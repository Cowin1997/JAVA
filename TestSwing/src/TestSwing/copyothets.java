package TestSwing;


import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.Graphics;
public class copyothets extends JFrame{
 //private static final long serialVersionUID = 1L;
public copyothets(){
setTitle("copyothets");
getContentPane().add(new RectJPanel());
}
     

    public static void main(String[] args){
        copyothets frame = new copyothets();
        frame.setSize(450,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
     
    class RectJPanel extends JPanel{
        private static final long serialVersionUID = 1L;
 
        protected void paintComponent( Graphics g ){
            super.paintComponent(g);
            int xx,yy=0;
            for(int i = 1;i<=4;i++){
                xx = 0;
                for( int j=1;j<=4;j++){
                    g.setColor(Color.white);
                    g.fillRect(xx,yy,50,50);
                    xx += 50;
                    g.setColor(Color.BLACK);
                    g.fillRect(xx,yy,50,50);
                    xx += 50;
                }
                yy +=50;
                xx = 0;
                for( int j=1;j<=4;j++){
                    g.setColor(Color.BLACK);
                    g.fillRect(xx,yy,50,50);                   
                     
                    xx += 50;
                    g.setColor(Color.WHITE);
                    g.fillRect(xx,yy,50,50);
                    xx += 50;
                }
                yy += 50;
            }
             
        }
    public Dimension getPreferredSize(){
            return new Dimension( 200,200 );
    }
    }
}