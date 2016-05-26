package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest extends JFrame{
	JButton btn1 = new JButton("NORTH");
	JButton btn2 = new JButton("SOUTH");
	JButton btn3 = new JButton("WEST");
	JButton btn4 = new JButton("EAST");
	JButton btn5 = new JButton("CENTER");
	
	public BorderLayoutTest(String title){
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void display(){
		//1. ������Ʈ�� ��ġ�� ContentPane�� ��´�.
		Container c = getContentPane();
		
		//2. � ��ġ�����ڸ� ����� ������ ����
		setLayout(new BorderLayout(10,10));
		
		//3. BorderLayout�� �� ������ ������Ʈ�� ��ġ
		c.add(btn1,BorderLayout.NORTH);
		c.add(btn2,BorderLayout.SOUTH);
		c.add(btn3,BorderLayout.WEST);
		c.add(btn4,BorderLayout.EAST);
		c.add(btn5,BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		BorderLayoutTest obj = new BorderLayoutTest("�������̾ƿ� �Ŵ���");
		

	}

}
