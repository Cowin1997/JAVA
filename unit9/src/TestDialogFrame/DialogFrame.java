package TestDialogFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;

import javax.swing.*;

public class DialogFrame extends JFrame {
	private ButtonPanel typePanel;
	private ButtonPanel messageTypePanel;
	private ButtonPanel messagePanel;
	private ButtonPanel comfirmPanel; 	// comfirm 确认(提交)类型 
	private ButtonPanel optionPanel;
	private ButtonPanel inputPanel;
	
	private String messageString="Message";
	private Icon messageIcon=new ImageIcon("sun.jpg");
	private Object messageObject=new Date();
	private JComponent messageComponent=new SampleComponent();
	
	
	class SampleComponent extends JComponent{
		public void paintComponent(Graphics g) {
			Graphics2D g2=(Graphics2D)g;
			Rectangle2D rect=new Rectangle2D.Double(0,0,getWidth()-1,getHeight()-1);
			g2.setPaint(Color.yellow);
			g2.fill(rect);
			g2.setPaint(Color.BLUE);
			g2.draw(rect);
			
		}
		public Dimension getPreferredSize() {
			return new Dimension(10,10);
		}
	}
	
	public DialogFrame() {
		JPanel Panel=new JPanel();
		Panel.setLayout(new GridLayout(2,3));
		// 赋值
		this.typePanel=new ButtonPanel("Type",new String[] {"Message","Confirm","Option","Input"});
		this.messageTypePanel=new ButtonPanel("Message Type",new String[] {"ERROR_MESSAGE","INFOMATION_MESSAGE",
				"WARNING_MESSAGE","QUESTION_MESSAGE","PLAIN_MESSAGE"});
		this.messagePanel=new ButtonPanel("Message",new String[] {"String","Icon","Component","Other",
				"Object[]"});
		
		this.comfirmPanel=new ButtonPanel("Confirm",new String[] {"DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION",
				"OK_CANCEL_OPTION"});
		this.optionPanel=new ButtonPanel("Option",new String[] {"String[]","Icon[]","Object[]"});
		
		this.inputPanel=new ButtonPanel("Input",new String[] {"Text_Field","Combo_Box"});
		
		Panel.add(this.typePanel);
		Panel.add(this.messageTypePanel);
		Panel.add(this.messagePanel);
		Panel.add(this.comfirmPanel);
		Panel.add(this.optionPanel);
		Panel.add(this.inputPanel);
		
		JPanel showPanel=new JPanel();
		JButton j=new JButton("Show");
		j.addActionListener(new ShowAction());
		showPanel.add(j);
	
		this.add(showPanel,BorderLayout.SOUTH);
		this.add(Panel, BorderLayout.CENTER);
		pack();	
	}
	
	public Object getMessage() {
		String s=messagePanel.getSelection();
		if(s.equals("String")) return this.messageString;
		else if(s.equals("Icon")) return this.messageIcon;
		else if(s.equals("Component")) return this.messageComponent;
		else if(s.equals("Other")) return this.messageObject;
		else if(s.equals("Object[]")) return new Object[] {this.messageString,this.messageIcon,
				this.messageComponent,this.messageObject};
		else return null;
		}
	
	public Object[] getOptions() {
		String s=this.optionPanel.getSelection();
		if(s.equals("String[]")) return new String[] {"Yellow","Blue","Red"};
		else if(s.equals("Icon[]")) return new Icon[] {new ImageIcon("123.gif"),new ImageIcon("earth.jpg"),
				new ImageIcon("sun.jpg")};
		else if(s.equals("Object[]"))  return new Object[] {this.messageString,this.messageIcon,this.messageComponent
				,this.messageObject};		
		else 
			return null;
	}
	public int getType(ButtonPanel panel) {
		String s=panel.getSelection();
		try {
			return JOptionPane.class.getField(s).getInt(null);
		}
		catch(Exception e) {
			return -1;
		}
	}
	
	private class ShowAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(typePanel.getSelection().equals("Confirm")) 
				JOptionPane.showConfirmDialog(DialogFrame.this, getMessage(),"Title",getType(comfirmPanel),
						getType(messageTypePanel));
			else if(typePanel.getSelection().equals("Input")) {
				if(inputPanel.getSelection().equals("Text_Field")) 
			JOptionPane.showInputDialog(DialogFrame.this, getMessage(),"Title",getType(messageTypePanel));
				else
			JOptionPane.showInputDialog(DialogFrame.this, getMessage(),"Title",getType(messageTypePanel),null,
					new String[] {"Yellow","Blue","Red"},"Blue");
			}
			else if(typePanel.getSelection().equals("Message"))
			JOptionPane.showMessageDialog(DialogFrame.this, getMessage(),"Title",getType(messagePanel));
			else if(typePanel.getSelection().equals("Option"))
		    JOptionPane.showOptionDialog(DialogFrame.this, getMessage(), "title",getType(comfirmPanel), 
		    		getType(messageTypePanel), null, getOptions(), getOptions()[0]);
		}
		
	}
	
	

}
