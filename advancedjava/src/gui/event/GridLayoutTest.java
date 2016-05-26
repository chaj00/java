package gui.event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class GridLayoutTest extends JFrame {
	
	String[] data = new String[] {"java", "thread", "network", "html5", "jquery"};
	JList lst = new JList(data);
	
	
	JLabel lbltitle = new JLabel("JavaFileList");
	
	JPanel centerPanel = new JPanel();
	SouthPanel southPanel = new SouthPanel();

	
	public GridLayoutTest(String title){
		super(title);
		display();
		startEvent();
		setSize(510, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void startEvent() {
		//GridLayoutTestListener listener = new GridLayoutTestListener(this);
		
	}
	public void display(){
		Container c = getContentPane();
		setLayout(new BorderLayout());
		
		c.setBackground(new Color(230,230,230));
		c.add(lbltitle,BorderLayout.NORTH);
		
		lst.setBackground(new Color(255,255,255));
		c.add(lst, BorderLayout.WEST);
		c.add(southPanel, BorderLayout.SOUTH);
		
		
		centerPanel.setBackground(new Color(190,190,190));
		c.add(centerPanel, BorderLayout.CENTER);
			
	}
	
		
	public static void main(String[] args) {
		GridLayoutTest obj = new GridLayoutTest("GridLayout¿¬½À");
	}

}
