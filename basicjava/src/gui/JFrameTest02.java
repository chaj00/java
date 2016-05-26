package gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest02 {

	public static void main(String[] args) {
		JFrame f = new JFrame("스윙연습");
		//1. 컴포넌트를 이용해서 JFrame을 디자인 하기 위해서 컴포넌트를 올려놓을 수 있는 ContentPane이 있어야 한다.
		//	 JFrame으로 부터 얻어와 작업한다.
		Container c = f.getContentPane();
		
		//2. 화면에 배치할 컴포넌트를 생성
		JButton btn1 = new JButton("안녕");
		JButton btn2 = new JButton("swing");
		JButton btn3 = new JButton("작업완료");
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,500);
		f.setVisible(true);

	}

}
