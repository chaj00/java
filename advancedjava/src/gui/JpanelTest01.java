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
		//1. 전체 JFrame에 대한 레이아웃을 설정
		setLayout(new BorderLayout());
		
		//2. 부분영역에 패널을 추가해야 한다면 패널에 대한 레이아웃을 설정한다.
		p1.setLayout(new GridLayout(3,1));
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		
		//3. JFrame에 필요한 각 영역에 패널과 기타 컴포넌트를 배치한다.
		add(p1,BorderLayout.WEST);
		add(btn4,BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		JpanelTest01 obj = new JpanelTest01("보더레이아웃 매니저");
		

	}

}