package Unit_8;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//简化代码
public class ButtonTest {
	public static void main(String[]args) {
		
		
		
		
		
		EventQueue.invokeLater( new Runnable() {
			public void run() {
				JFrame j=new ButtonFrame();
			//	j.setLayout(null);//默认的是撑满；
				j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	/*			String plaf="javax.swing.plaf.nimbus.NimbusLookAndFeel";
				try {
					UIManager.setLookAndFeel(plaf);
					SwingUtilities.updateComponentTreeUI(j);
				}
				catch(Exception e) {
					e.getStackTrace();
				}
				*/
				//Image image=new ImageIcon("sun.jpg").getImage();
				
			}
			
		});
		
	}
}

class ButtonFrame extends JFrame{
	private JPanel button;
	private static final int DEFAULT_WIDTH=300;
	private static final int DEFAULT_HEIGHT=200;
	public ButtonFrame() {
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		this.setVisible(true);
		this.setTitle("ButtonTest");
		Image image=new ImageIcon("sun.jpg").getImage();
		this.setIconImage(image);
		this.setLocation(100, 100);
		button=new JPanel();
		//ColorAction YelloButton=new ColorAction(Color.YELLOW);
		JButton YellowButton=new JButton("YellowButton");
		button.add(YellowButton);
		
		JButton GreenButton=new JButton("GreenButton");
		button.add(GreenButton);
		button.setSize(300, 300);
		button.setBackground(Color.gray);
		JButton BlueButton=new JButton("BlueButton");
		button.add(BlueButton);
		this.add(button);
		ColorAction YellowAction=new ColorAction(Color.YELLOW);
		ColorAction GreenAction=new ColorAction(Color.GREEN);
		ColorAction BlueAction=new ColorAction(Color.BLUE);
		YellowButton.addActionListener(YellowAction);
		GreenButton.addActionListener(GreenAction);
		BlueButton.addActionListener(BlueAction
				);
	
	}
	

class ColorAction implements ActionListener{
	private Color bgcolor;
	public ColorAction(Color c) {
		this.bgcolor=c;
	}
	public void actionPerformed(ActionEvent e) {
		button.setBackground(this.bgcolor);
		
	}
}
}