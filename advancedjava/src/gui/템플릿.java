package gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ���ø� extends JFrame{
	JButton btn1 = new JButton("NORTH");
	JButton btn2 = new JButton("SOUTH");
	JButton btn3 = new JButton("WEST");
	JButton btn4 = new JButton("EAST");
	JButton btn5 = new JButton("CENTER");
	
	public ���ø�(String title){
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void display(){
		Container c = getContentPane();
	}
	
	public static void main(String[] args) {
		���ø� obj = new ���ø�("�������̾ƿ� �Ŵ���");
		

	}

}