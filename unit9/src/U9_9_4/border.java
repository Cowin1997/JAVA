package U9_9_4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class border  extends JFrame{
	private JPanel demoPanel;
	private JPanel buttonPanel;
	private ButtonGroup group;
	public border() {
		this.setSize(500,500);
		this.setTitle("边框测试");
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//---------------------------------------------------------------------------------------//
		this.demoPanel=new JPanel();
		this.buttonPanel=new JPanel();
		this.group=new ButtonGroup();
		
		addButton("Lowered bevel",BorderFactory.createLoweredBevelBorder());
		addButton("Raised bevel",BorderFactory.createRaisedBevelBorder());
		addButton("Etched",BorderFactory.createEtchedBorder());
		addButton("Line",BorderFactory.createLineBorder(Color.ORANGE,10));
		addButton("Matte",BorderFactory.createMatteBorder(10, 10, 10, 10, Color.BLUE));
		addButton("Empty",BorderFactory.createEmptyBorder());
		
	    Border etched=BorderFactory.createEtchedBorder();
	    Border title=BorderFactory.createTitledBorder(etched,"Border types");
	    this.buttonPanel.setBorder(title);
	    
	    this.setLayout(new GridLayout(2,1));
	    this.add(this.buttonPanel);
	    this.add(this.demoPanel);
		
		
	    
		
	}
//---------------------------------------------------------------------------------------//	
	public void addButton(String name,final Border border) {
		JRadioButton button=new JRadioButton(name);
		
		button.addActionListener(new ActionListener() {
			@Override
		public void actionPerformed(ActionEvent e) {demoPanel.setBorder(border);}});	
		this.buttonPanel.add(button);
		this.group.add(button);
	}
    
}
