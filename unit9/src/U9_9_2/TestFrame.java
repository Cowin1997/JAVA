package U9_9_2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestFrame extends JFrame{
	private JPanel p;
	private JTextArea q;
	public TestFrame() { 
		p=new User_name_Panel().getJP();
		q=new User_name_Panel().getJT();
		this.add(p,BorderLayout.NORTH);  
		JScrollPane scrollpane=new JScrollPane(q);
	    this.add(scrollpane, BorderLayout.CENTER);
		this.setTitle("测试窗口");  
		this.setSize(500,500);
		this.setLocation(100, 100);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setVisible(true);
	  
	    //不管了  乱来了
	    JPanel j=new JPanel();
	    Button b=new Button("Insert");
	    b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				q.append("223\n");
				
			}
		
	    	
	    });
	    	

	    j.add(b);
	    this.add(j, BorderLayout.SOUTH);
	  

		
	}
	

}
