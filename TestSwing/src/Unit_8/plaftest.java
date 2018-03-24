package Unit_8;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class plaftest {
	public static void main(String []args) {
		JFrame j=new plafFrame();
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
		//j.setSize(300,300);
		//j.setLayout(null);
	}
   
}


class plafFrame extends JFrame{
	private JPanel button;
	public plafFrame() {
		button=new JPanel();
		button.setSize(500,500);button.setBackground(Color.pink);
	
		setSize(800,800);
		setLayout(null);
		this.setLocation(100, 100);
		UIManager.LookAndFeelInfo[]infos=UIManager.getInstalledLookAndFeels();
		for(UIManager.LookAndFeelInfo info:infos) 
			makeButton(info.getName(),info.getClassName());
			
			
			this.add(button);
			//pack();
			
	}
	public void makeButton(String name,final String plafName) {
		JButton b = new JButton(name);
		this.button.add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					UIManager.setLookAndFeel(plafName);
					SwingUtilities.updateComponentTreeUI(plafFrame.this);
					System.out.println(plafName);
				//	pack();
				} catch (Exception x) {
					// TODO 自动生成的 catch 块
					x.printStackTrace();
				} 
				
			}
			
		});
		
		
		
	}
}