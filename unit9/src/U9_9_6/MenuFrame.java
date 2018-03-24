package U9_9_6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class MenuFrame extends MyJFrame {
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGHT = 200;
	private Action savaAction;
	private Action savaAsAction;
	private JCheckBoxMenuItem readonlyItem; // 复选框 菜单项 read only
	private JPopupMenu popup;// 弹出菜单

	class MyAction extends AbstractAction {
		public MyAction(String name) {
			super(name);
		}

		/*
		 * public AbstractAction(String name) { putValue(Action.NAME, name); }
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(this.getValue(Action.NAME)+" selected.");

		}

	}

	public MenuFrame() {
		super("菜单测试",DEFAULT_WIDTH,DEFAULT_HEIGHT);
		JMenu fileMenu=new JMenu("File");  //菜单
		fileMenu.add(new MyAction("New"));
		
		JMenuItem openItem=fileMenu.add(new MyAction("Open")); //创建并返回创建的菜单项对象
		openItem.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));//设置加速器 
		
		
		
		fileMenu.addSeparator();  //分隔符
		this.savaAction=new MyAction("Save");
		JMenuItem savaItem=fileMenu.add(this.savaAction);
		savaItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
		
		
		this.savaAsAction=new MyAction("SaveAs");
		JMenuItem savaAsItem=fileMenu.add(this.savaAsAction);
		fileMenu.addSeparator();
		
		fileMenu.add( new AbstractAction("Exit") {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);		
			}
			
		});
		
		this.readonlyItem=new JCheckBoxMenuItem("Read_only");
		this.readonlyItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean savaOk=!readonlyItem.isSelected();
				savaAction.setEnabled(savaOk);
				savaAsAction.setEnabled(savaOk);	
			}});
		
		
		
		ButtonGroup group=new ButtonGroup();
		JRadioButtonMenuItem insertItem=new JRadioButtonMenuItem("Insert");
		insertItem.setSelected(true);
		JRadioButtonMenuItem overtypeItem=new JRadioButtonMenuItem("Overtype");
		group.add(insertItem);
		group.add(overtypeItem);
	
		
		Action cutAction=new MyAction("cut");
		Action copyAction=new MyAction("copyAction");
		Action pasteAction=new MyAction("cut");
		cutAction.putValue(Action.SMALL_ICON, new ImageIcon("earth.jpg"));
		copyAction.putValue(Action.SMALL_ICON, new ImageIcon("earth.jpg"));
		pasteAction.putValue(Action.SMALL_ICON, new ImageIcon("earth.jpg"));
		
		JMenu editMenu=new JMenu("Edit");
		editMenu.add(cutAction);
		editMenu.add(copyAction);
		editMenu.add(pasteAction);
		
		JMenu optionMenu=new JMenu("Options");
		optionMenu.add(this.readonlyItem);
		optionMenu.addSeparator();
		optionMenu.add(insertItem);
		optionMenu.add(overtypeItem);
		
		editMenu.addSeparator();
		editMenu.add(optionMenu);
		
		JMenu helpMenu=new JMenu("Help");
		helpMenu.setMnemonic('H');
		
		JMenuItem indexItem=new JMenuItem("Index");
		indexItem.setMnemonic('I');
		helpMenu.add(indexItem);
		
		Action aboutAction=new MyAction("About");
		aboutAction.putValue(Action.MNEMONIC_KEY, new Integer('A'));
		helpMenu.add(aboutAction);
		//JMenuItem aboutItem=new JMenuItem("About");
	    //aboutItem.setMnemonic('A');
	    //helpMenu.add(aboutItem);
		
		
		JMenuBar menuBar=new JMenuBar();
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);		
		this.setJMenuBar(menuBar);
		
		this.popup=new JPopupMenu();
		this.popup.add(cutAction);
		this.popup.add(copyAction);
		this.popup.add(pasteAction);
		
		JPanel popupPanel=new JPanel();
		popupPanel.setComponentPopupMenu(this.popup);
		popupPanel.addMouseListener(new MouseAdapter() {});
		
		this.add(popupPanel);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
