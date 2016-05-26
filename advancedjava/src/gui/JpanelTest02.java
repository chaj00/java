package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JpanelTest02 extends JFrame{
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btn10 = new JButton("확인");
	
	public JpanelTest02(String title){
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void display(){
		Container c = getContentPane();
		//1. 전체 JFrame에 대한 레이아웃을 설정
		setLayout(new BorderLayout());
		
		//2. 부분영역에 패널을 추가해야 한다면 패널에 대한 레이아웃을 설정한다.
		p1.setLayout(new GridLayout(1,3));
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		
		p2.setLayout(new GridLayout(3,2));
		p2.add(btn4);
		p2.add(btn5);
		p2.add(btn6);
		p2.add(btn7);
		p2.add(btn8);
		p2.add(btn9);
		
		p3.setLayout(new FlowLayout(btn10.RIGHT));
		p3.add(btn10);
		
		
		//3. JFrame에 필요한 각 영역에 패널과 기타 컴포넌트를 배치한다.
		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);
		add(p3,BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		JpanelTest02 obj = new JpanelTest02("보더레이아웃 매니저");
	}
}