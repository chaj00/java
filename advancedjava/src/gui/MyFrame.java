package gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	JButton btn1 = new JButton("�ȳ�");
	JButton btn2 = new JButton("swing");
	JButton btn3 = new JButton("�۾��Ϸ�");
	
	public MyFrame(String title){
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//ȭ������� �޼ҵ�
	public void display(){
		Container c = getContentPane();
		
		//2. ȭ�鿡 ��ġ�� ������Ʈ�� ����
		JButton btn1 = new JButton("�ȳ�");
		JButton btn2 = new JButton("swing");
		JButton btn3 = new JButton("�۾��Ϸ�");
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
	}
}
