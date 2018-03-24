package Unit_8;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.InputMap;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class ActionFrame extends JFrame{
	private JPanel buttonPanel;
	private static final int DEFAULT_X=300;
	private static final int DEFAULT_Y=200;
	
	public ActionFrame() {
		this.setSize(DEFAULT_X, DEFAULT_Y);
		this.setLocation(100, 100);
		this.buttonPanel=new JPanel();
		
		Action Yellow=new ColorAction("YELLOW",new ImageIcon("sun.jpg"),Color.YELLOW);
		Action Blue=new ColorAction("Blue",new ImageIcon("sun.jpg"),Color.BLUE);
		Action Green=new ColorAction("Green",new ImageIcon("sun.jpg"),Color.GREEN);
		buttonPanel.add(new JButton(Yellow));
		buttonPanel.add(new JButton(Blue));
		buttonPanel.add(new JButton(Green));
		this.add(buttonPanel);
		
	//	InputMap imap=buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
		InputMap imap=buttonPanel.getInputMap(JComponent.WHEN_FOCUSED);
		imap.put(KeyStroke.getKeyStroke("ctrl Y"), "set yellow");
		imap.put(KeyStroke.getKeyStroke("ctrl K"), "set yellow2");
		imap.put(KeyStroke.getKeyStroke("ctrl B"), "set blue");
		imap.put(KeyStroke.getKeyStroke("ctrl G"), "set green");
	
		
		ActionMap amap= buttonPanel.getActionMap();
		amap.put("set yellow", Yellow);
		amap.put("set yellow2", Yellow);
		amap.put("set blue", Blue);
		amap.put("set green", Green);
		
	}

public class ColorAction extends AbstractAction  {
	public ColorAction(String name,Icon icon,Color c) {
		putValue(Action.NAME,name);
		putValue(Action.SMALL_ICON,icon);
		putValue(Action.SHORT_DESCRIPTION,"Set panel color to "+name.toLowerCase());
		putValue("color",c);
		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Color c=(Color)getValue("color");
		buttonPanel.setBackground(c);
		
	}
	
}


public static void main(String[]args) {
		JFrame f=new ActionFrame();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
}
}
