package U9_9_3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RaButton extends JFrame{
	private JPanel panel;
	private ButtonGroup group;
	private JLabel label;
	private static final int FONTSIZE=36;
	
	public RaButton() {
	     this.setSize(500,500);
	     this.setLocation(100,100);
	     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     
	     
		//        Set Label
		label=new JLabel("This is a JLabel ！！");
		label.setFont(new Font("宋体",Font.PLAIN,FONTSIZE));
		this.add(label,BorderLayout.CENTER);
		
		//        Set RadioButton
		panel=new JPanel();
		group=new ButtonGroup();
		addRadioButton("Small",8);
		addRadioButton("Medium",12);
		addRadioButton("Large",18);
		addRadioButton("Extra Large",36);
		this.add(panel, BorderLayout.SOUTH);
		

	}
	
	
	
	 public void addRadioButton(String name,final int size) {
		 boolean selected=(size==FONTSIZE);
		 JRadioButton  b=new JRadioButton(name,selected);
		 this.group.add(b);
		 this.panel.add(b);
		
		 ActionListener listener=new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			  label.setFont(new Font("宋体",Font.PLAIN,size));
			}	 
		 };	 
		 b.addActionListener(listener);
	 }
	 
	
	

}
