package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JpanelTest01 extends JFrame{
	JPanel p1 = new JPanel();
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	
	
	public JpanelTest01(String title){
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void display(){
		Container c = getContentPane();
		//1. ��ü JFrame�� ���� ���̾ƿ��� ����
		setLayout(new BorderLayout());
		
		//2. �κп����� �г��� �߰��ؾ� �Ѵٸ� �гο� ���� ���̾ƿ��� �����Ѵ�.
		p1.setLayout(new GridLayout(3,1));
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		
		//3. JFrame�� �ʿ��� �� ������ �гΰ� ��Ÿ ������Ʈ�� ��ġ�Ѵ�.
		add(p1,BorderLayout.WEST);
		add(btn4,BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		JpanelTest01 obj = new JpanelTest01("�������̾ƿ� �Ŵ���");
		

	}

}