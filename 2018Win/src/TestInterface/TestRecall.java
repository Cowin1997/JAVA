package TestInterface;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TestRecall {
	//接口与回调
	public static void main(String[]args) {
		ActionListener listener=new TimerPrinter();
		Timer t=new Timer(1000,listener);
		t.start();
		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	
	}
}

class TimerPrinter implements ActionListener{
    public void actionPerformed(ActionEvent e) {
    	Date now=new Date();
    	System.out.println("Now is:"+now);
    	Toolkit.getDefaultToolkit().beep();
    	
    }


	
}