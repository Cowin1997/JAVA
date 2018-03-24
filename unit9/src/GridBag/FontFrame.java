package GridBag;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class FontFrame extends JFrame{
	public static final int TEXTROWS=10;  //10行
	public static final int TEXTCOLLUMNS=20; //20列
	private JComboBox <String> face;
	private JComboBox <Integer> size;
	private JCheckBox bold;
	private JCheckBox italic;
	private JTextArea sample;
	
	
	
	public FontFrame() {
		GridBagLayout layout=new GridBagLayout();
		this.setLayout(layout);
		
ActionListener listener=EventHandler.create(ActionListener.class, this, "updateSample");
	    
	JLabel faceLabel =new JLabel("Face:");
face=new JComboBox<>(new String[] {"Serif","SanSerif","Monospaced","Dialog","DialogInput"});
	face.addActionListener(listener);
	
	JLabel sizeLabel =new JLabel("size:");
	size=new JComboBox<>(new Integer[] {8,10,12,15,18,24,36,48});
	size.addActionListener(listener);
	
	
	this.bold=new JCheckBox("Bold");
	this.italic=new JCheckBox("Italic");
	bold.addActionListener(listener);
	italic.addActionListener(listener);
	
	
	this.sample=new JTextArea(this.TEXTROWS,this.TEXTCOLLUMNS);
	sample.setText("The quick brown fox jumps over the lazy dog");
	sample.setEditable(false);
	sample.setLineWrap(true);
	sample.setBorder(BorderFactory.createEtchedBorder());
	
	add(faceLabel,new GBC(0,0).setAnchor(GBC.EAST).setWeigth(10, 0));
	add(face,new GBC(1,0).setFill(GBC.HORIZONTAL).setWeigth(100, 0).setInsets(1));
	add(sizeLabel,new GBC(0,1).setAnchor(GBC.EAST).setWeigth(10, 0));
	add(size,new GBC(1,1).setFill(GBC.HORIZONTAL).setWeigth(100, 0).setInsets(1));
	
	add(bold,new GBC(0,2,2,1).setAnchor(GBC.CENTER).setWeigth(100, 100));
	add(italic,new GBC(0,3,2,1).setAnchor(GBC.CENTER).setWeigth(100, 100));
	add(sample,new GBC(2,0,1,4).setFill(GBC.BOTH).setWeigth(0, 100));
	pack();
	updateSample();
	
			
		
	}
	
	public void updateSample() {
		String fontFace=(String)face.getSelectedItem();
		int fontStyle=(bold.isSelected()?Font.BOLD:0)+
				(italic.isSelected()?Font.ITALIC:0);
		int fontSize=size.getItemAt(size.getSelectedIndex());
		Font font=new Font(fontFace,fontStyle,fontSize);
		sample.setFont(font);
		sample.repaint();
	}
	

}
