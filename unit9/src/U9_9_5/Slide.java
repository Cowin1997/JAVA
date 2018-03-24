package U9_9_5;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Slide extends JFrame{
	private JPanel panel;
	private JTextField textfield;
	private ChangeListener listener;
	public Slide() {
		setSize(500,500);
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.panel=new JPanel();
		this.textfield=new JTextField();
		this.panel.setLayout(new GridBagLayout()); //网格布局管理器
		this.listener=new ChangeListener() {
		@Override
			public void stateChanged(ChangeEvent e) 
			{JSlider source=(JSlider)e.getSource();
			 textfield.setText(""+source.getValue());}};
		
			 
		JSlider slider=new JSlider();
		addSlider(slider,"Plain");
		
		slider=new JSlider();
		slider.setPaintTicks(true);  //显示记号 ticks记号
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5); //Minor 较小的
		addSlider(slider,"Ticks");
		
		slider=new JSlider();
		slider.setPaintLabels(true); //显示标尺
		slider.setSnapToTicks(true);  //标尺对齐
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5); //Minor 较小的
		addSlider(slider,"Snap to ticks");
		
		slider=new JSlider();
		slider.setPaintLabels(true); //显示标尺
		slider.setPaintTrack(false);  //没滑动轨
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5); //Minor 较小的
		addSlider(slider,"No Track");
		
		slider=new JSlider();
		slider.setPaintLabels(true); //显示标尺
		slider.setInverted(true);  //设置反向    Inverted反向的
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5); //Minor 较小的
		addSlider(slider,"Inverted");
		
		slider=new JSlider();
		slider.setPaintLabels(true); //显示标尺
		slider.setPaintLabels(true);  //设置标签
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5); //Minor 较小的
		addSlider(slider,"Labels");
		
		 //设置字母标签
		slider=new JSlider();
		slider.setPaintLabels(true); //显示标尺
		slider.setPaintLabels(true);  //设置标签
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5); //Minor 较小的
		
		
		Hashtable <Integer,Component> labeltable=new Hashtable<>();
		labeltable.put(0, new JLabel("A"));
		labeltable.put(20, new JLabel("B"));
		labeltable.put(40, new JLabel("C"));
		labeltable.put(60, new JLabel("D"));
		labeltable.put(80, new JLabel("E"));
		labeltable.put(100, new JLabel("F"));
		slider.setLabelTable(labeltable);
		addSlider(slider,"Custom Label");
		
		//图片的
		slider=new JSlider();
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setSnapToTicks(true);
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(20);
		
		labeltable=new Hashtable<Integer,Component>();
		labeltable.put(0, new JLabel(new ImageIcon("earth.jpg")));
		labeltable.put(20,new JLabel(new ImageIcon("earth.jpg")));
		labeltable.put(40, new JLabel(new ImageIcon("earth.jpg")));
		labeltable.put(60, new JLabel(new ImageIcon("earth.jpg")));
		labeltable.put(80, new JLabel(new ImageIcon("earth.jpg")));
		labeltable.put(100, new JLabel(new ImageIcon("earth.jpg")));
		slider.setLabelTable(labeltable);
		addSlider(slider,"Icon Labels");
		
		add(this.textfield,BorderLayout.SOUTH);
		add(this.panel,BorderLayout.CENTER);
		
		
		
		
		
			 
			 
		
	}
	
	public void addSlider(JSlider js,String description) {
		js.addChangeListener(listener);
		JPanel panel=new JPanel();
		panel.add(js);
		panel.add(new JLabel(description));
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);//设置垂直对齐方式。左对齐 在X轴上垂直
		
		GridBagConstraints gbc=new GridBagConstraints(); //Constraints 约束，强制
		gbc.gridy=Slide.this.panel.getComponentCount();  //gridy 格子
		gbc.anchor=GridBagConstraints.WEST; //anchor 固定 ，抛锚
		Slide.this.panel.add(panel,gbc);
	
	}
	

}
