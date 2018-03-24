package U9_9_3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class CheckBox extends JFrame{
	private JPanel panel;
    public CheckBox() {
    	this.setSize(500,500);
    	this.setLocation(100, 100);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setTitle("复选框");
    
    	panel = new JPanel();
    	JCheckBox jc1=new JCheckBox("Bold");
    	JCheckBox jc2=new JCheckBox("italic");
    	panel.add(jc1);
    	panel.add(jc2);
   
        Border border=BorderFactory.createEtchedBorder(EtchedBorder.RAISED,Color.blue,Color.RED);
        panel.setBorder(border);
        this.add(panel,BorderLayout.SOUTH);
        
        
        JTextField textfield=new JTextField(35);
        JTextArea textarea=new JTextArea(40,40);
        textarea.setEnabled(false);
        textarea.setFont(new Font("黑体",Font.LAYOUT_NO_LIMIT_CONTEXT,30));
        JScrollPane scrollpane=new JScrollPane(textarea);
        JPanel textpanel=new JPanel();
        Button b=new Button("Insert");
        b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textarea.append(textfield.getText()+"\n");
			}	
        });
        textpanel.add(textfield);
        textpanel.add(b);
        textpanel.setBorder(border);
        this.add(textpanel, BorderLayout.NORTH);
        this.add(scrollpane, BorderLayout.CENTER);
        
        
    	
    	jc1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int mod=0;
				if(jc1.isSelected()) mod+=Font.BOLD;
				if(jc2.isSelected()) mod+=Font.ITALIC;
				textarea.setFont(new Font("宋体",mod,50));
			}
    		
    	});
    	jc2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int mod=0;
				if(jc1.isSelected()) mod+=Font.BOLD;
				if(jc2.isSelected()) mod+=Font.ITALIC;
				textarea.setFont(new Font("宋体",mod,50));
			}
    		
    	});
    }
    

}
