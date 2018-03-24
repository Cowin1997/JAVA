package Unit_8;

import java.awt.Color;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;

class ColorAction extends AbstractAction  {
	public ColorAction(String name,Icon icon,Color c) {
		putValue(Action.NAME,name);
		putValue(this.SMALL_ICON,icon);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO 自动生成的方法存根
		
	}
	
}
