package gui.event;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SouthPanel extends JPanel {	
	JLabel lbl1 = new JLabel("선택파일 경로:");
	JLabel lbl2 = new JLabel("파일 복사: 소스파일");
	JLabel lbl3 = new JLabel("복사파일");
	
	JTextField tf1 = new JTextField("ColorFont.java",8);
	JTextField tf2 = new JTextField("copy.java",5);
	
	
	JButton btn1 = new JButton("<<복사>>");
	
	JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
	JPanel p2 = new JPanel();
	
	public SouthPanel() {
		setLayout(new BorderLayout());
		
			
		p1.add(lbl1);
		p1.setBackground(new Color(255,255,108));
		add(p1, BorderLayout.NORTH);
		
		p2.add(lbl2);
		p2.add(tf1);
		p2.add(lbl3);
		p2.add(tf2);
		p2.add(btn1);
		p2.setBackground(new Color(255,255,108));		
		add(p2, BorderLayout.CENTER);
			
	}
	
}	
	
	
	


	
	



	

