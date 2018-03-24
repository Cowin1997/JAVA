package U9_9_4;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBox extends JFrame{
	private JComboBox <Object>faceCombo;
	private JPanel panel;
	private JLabel label;
	public ComboBox() {
		this.setTitle("ComboBox");
		this.setSize(500, 500);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//----------------------------------------------------------------------------------------//
		this.panel=new JPanel();
		this.faceCombo=new JComboBox<>();
		this.label=new JLabel("new JLabel");
		this.add(label,BorderLayout.CENTER);
		this.faceCombo.addItem("Serif");
		this.faceCombo.addItem("SanSerif");
		this.faceCombo.addItem("Monospaced");
		this.faceCombo.addItem("Dialog");
		this.faceCombo.addItem("DialogInput");
	//	 Object I=new Integer(3);
	//	  System.out.println(I);
		this.faceCombo.addItem(3);
		
		//this.faceCombo.setEditable(true);
		
		
		this.faceCombo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//if(faceCombo.getItemAt(faceCombo.getSelectedIndex()).equals("3")) 
			//	if(Integer.valueOf(faceCombo.getItemAt(faceCombo.getSelectedIndex()).toString())==3) 
				label.setText(String.valueOf(faceCombo.getItemAt(faceCombo.getSelectedIndex())));
			
				//label.setText(faceCombo.getItemAt(faceCombo.getSelectedIndex()).toString());
				System.out.println(faceCombo.getSelectedIndex()); //0 1 2 3 4
				System.out.println(faceCombo.getItemAt(faceCombo.getSelectedIndex()));  
				// System 可以直接打印对象  getIndex 返回的是下标（整数）, getitemat 返回的是泛型数组的类型 这里是Object 
			//	label.setFont(new Font( (String) faceCombo.getItemAt(faceCombo.getSelectedIndex()),Font.PLAIN,24));
				}});
		
		this.panel.add(this.faceCombo);
		this.add(panel, BorderLayout.SOUTH);
		
		
		
	}
	

}
