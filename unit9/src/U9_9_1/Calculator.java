package U9_9_1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Calculator {
	public static void main (String[]args) {
		JFrame frame=new CaculatorFrame();
	//	frame.setLayout(null);
	//	frame.setResizable(false);//  设置窗口不可改变大小
	
		
	}
	

}

 class CaculatorFrame extends JFrame{
	 private  CalculatorPanel  p;
 	 public CaculatorFrame() {
		 p=new CalculatorPanel();	 
		 add(p);
		 this.setTitle("计算器");
		 this.setSize(500,500);    
		 this.setLocation(100,100);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//addKeyListener(p);
	     this.setVisible(true);
	     this.setResizable(false);
		// p.setBounds(0,0, 200, 200);  //设置大小    要先设置setsize 否则不起作用
		 
	 }
	
 }