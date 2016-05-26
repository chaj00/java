package gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutTest extends JFrame{
	JButton btn1 = new JButton("NORTH");
	JButton btn2 = new JButton("SOUTH");
	JButton btn3 = new JButton("WEST");
	JButton btn4 = new JButton("EAST");
	JButton btn5 = new JButton("CENTER");
	
	public FlowLayoutTest(String title){
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void display(){
		Container c = getContentPane();
		setLayout(new FlowLayout(FlowLayout.LEFT));
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		c.add(btn4);
		c.add(btn5);
	}
	
	public static void main(String[] args) {
		FlowLayoutTest obj = new FlowLayoutTest("보더레이아웃 매니저");
		

	}

}