package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
	JButton btn1 = new JButton("++");
	JButton btn2 = new JButton("-");
	JButton btn3 = new JButton("*");
	JButton btn4 = new JButton("/");
	
	public ButtonPanel(){
		setLayout(new GridLayout(1,4));
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
	}

}
