package gui.event;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ButtonPanel extends JPanel{
	public JButton btn1 = new JButton("+");
	public JButton btn2 = new JButton("-");
	public JButton btn3 = new JButton("*");
	public JButton btn4 = new JButton("/");
	
	public ButtonPanel(){
		setLayout(new GridLayout(1,4));
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
	}

}
