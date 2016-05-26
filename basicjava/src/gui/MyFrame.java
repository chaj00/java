package gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	JButton btn1 = new JButton("안녕");
	JButton btn2 = new JButton("swing");
	JButton btn3 = new JButton("작업완료");
	
	public MyFrame(String title){
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	//화면디자인 메소드
	public void display(){
		Container c = getContentPane();
		
		//2. 화면에 배치할 컴포넌트를 생성
		JButton btn1 = new JButton("안녕");
		JButton btn2 = new JButton("swing");
		JButton btn3 = new JButton("작업완료");
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
	}
}
