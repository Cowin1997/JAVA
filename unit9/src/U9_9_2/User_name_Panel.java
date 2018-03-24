package U9_9_2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class User_name_Panel extends JPanel {
	private JPanel UserPanel;
	public  JTextField Text;
	public JPasswordField PassWord;
	private JTextArea  textArea;
	
	public User_name_Panel() {
		UserPanel=new JPanel();
		Text=new JTextField();
		PassWord=new JPasswordField();
		UserPanel.setLayout(new GridLayout(2,2));
		UserPanel.add(new JLabel("User Name",SwingConstants.RIGHT));
		UserPanel.add(Text);
		UserPanel.add(new JLabel("PassWord",SwingConstants.RIGHT));
		UserPanel.add(PassWord);
		UserPanel.setBackground(Color.pink);
		textArea=new JTextArea(8,20);
		
		//textArea.add(scrollpane);
		
		
	
		
	}
	public JPanel getJP() {
		return this.UserPanel;
	}
	public JTextArea getJT() {
		return this.textArea;
	}
}
