package U9_9_1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class CalculatorPanel extends JPanel {//implements KeyListener  {
	private JButton display;
	private JPanel panel;//大面板中的小面板
	private double result;
	private String LastCommand;
	private boolean start;
	
	public CalculatorPanel() {
        super();
		this.setBackground(Color.PINK);
		this.setLayout(new BorderLayout());//面板的框架布局管理器
		result=0;
		LastCommand="=";
		start=true;
		display=new JButton("0");
		display.setEnabled(false);
		add(display,BorderLayout.NORTH);// 大面板 面板 add 按钮  set North
	//	this.setVisible(false);
	ActionListener insert=new InsertAction();
	  ActionListener command=new CommandAction();
		panel=new JPanel();
		panel.setLayout(new GridLayout(4,4));
		
		addButton("7",insert);
		addButton("8",insert);
		addButton("9",insert);
		addButton("/",command);
		
		addButton("4",insert);
		addButton("5",insert);
		addButton("6",insert);
		addButton("*",command);
		
		addButton("1",insert);
		addButton("2",insert);
		addButton("3",insert);
		addButton("-",command);
		
		addButton("0",insert);
		addButton(".",insert);
		addButton("=",command);
		addButton("+",command);
		add(panel,BorderLayout.CENTER);
		this.addKeyListener(new MyKeyListen());
		this.setFocusable(true);
		
	
	}
	
     private void addButton(String label,ActionListener listener) {
    	 JButton b=new JButton(label);
    	 b.addActionListener(listener);
    	 panel.add(b);

     }
     
     //内部类  输入
     private class InsertAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String input=e.getActionCommand();
		    Insert(input);
		    CalculatorPanel.this.getFocusListeners();
    	 CalculatorPanel.this.requestFocus(); //重新获得焦点
     }
     }
  
     
     //内部类  命令
     private class CommandAction implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String command=e.getActionCommand();
			CalculatorPanel.this.Command(command);
			CalculatorPanel.this.requestFocus();
     }
     }
		
		//
		private void calculate(double x) {
			if(LastCommand.equals("+")) result+=x;
			if(LastCommand.equals("-"))result-=x;
			if(LastCommand.equals("*")) result*=x;
			if(LastCommand.equals("/")) result/=x;
			if(LastCommand.equals("=")) result=x;
			if(LastCommand.equals("\n")) result=x;
			display.setText(""+result);
		}	
		//
		
		
		//
		class MyKeyListen extends KeyAdapter{
			@Override
				 public void keyPressed(KeyEvent e) {
					System.out.println("输入的是"+e.getKeyChar());
					String insert=Character.toString(e.getKeyChar());
					System.out.println("捕获的是"+insert);
					switch(e.getKeyChar()) {
					case '1':  
					case '2': 
					case '3': 
					case '4': 
					case '5': 
					case '6': 
					case '7': 
					case '8': 
					case '9': 
					case '0':
					case '.': Insert(insert); break;
					case '\n':  Command("="); break;
					case '+':
					case '=':
					case '-':   
					case '*': 
					case '/': Command(insert); break;
					default:   System.out.println("不可识别");break;	
					}
				 }
			@Override
			  public void keyReleased(KeyEvent e) {}
		}
		//
		
		
		
		//
		private void Command(String c) {
			String command=c;
			System.out.println("Command:"+command);
			if(start) {
				if(command.equals("-")){
					display.setText(command);
					start=false;
				}
				else
			
					LastCommand=command;
			}
			else {
				calculate(Double.parseDouble(display.getText()));
				LastCommand=command;
				start=true;
			}
			
		}
		//
		
		
		
		//
		private void Insert(String c) {
			String input=c;
			System.out.println("input:"+input);
			if(start) {
				display.setText("");
				start=false;
			}
			display.setText(display.getText()+input);

		}
		//
	
}


