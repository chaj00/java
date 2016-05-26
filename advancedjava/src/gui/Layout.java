package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Layout extends JFrame{
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	
	JButton btn1 = new JButton("����");
	JButton btn2 = new JButton("����");
	JButton btn3 = new JButton("����");
	JButton btn4 = new JButton("��ȸ");
	JButton btn5 = new JButton("�˻�");

	JTextField tfdata1 =new JTextField(20);
		
	public Layout(String title){
		super(title);
		display();
		setSize(350,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void display(){
		Container c = getContentPane();
		setLayout(new BorderLayout());
		
		p1.setLayout(new FlowLayout());
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		p1.add(btn4);
		p1.setBackground(Color.YELLOW);
		add(p1, BorderLayout.NORTH);
		
		
		add(p2, BorderLayout.CENTER);
		
		p3.setLayout(new FlowLayout());
		p3.add(tfdata1);
		p3.add(btn5);
		p3.setBackground(Color.BLUE);
		add(p3, BorderLayout.SOUTH);
		
			
	}
	public static void main(String[] args) {
		Layout obj = new Layout("���̾ƿ�");
	}
}