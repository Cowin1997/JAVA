package TestDialogFrame;

import javax.swing.*;

public class ButtonPanel extends JPanel{
	private ButtonGroup group;
	
	public ButtonPanel(String title,String[]options) {
		this.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),title));
		this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));//面板里的组件 垂直排列
		this.group=new ButtonGroup();
		for(String option:options) {
			JRadioButton b=new JRadioButton(option);
			b.setActionCommand(option);
			add(b);
			this.group.add(b);
			b.setSelected(option==options[0]);
		}
	}
	public String getSelection() {
		return group.getSelection().getActionCommand();
	}

}
