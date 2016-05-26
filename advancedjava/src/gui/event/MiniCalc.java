package gui.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MiniCalc extends JFrame{
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	ButtonPanel p3 = new ButtonPanel();
	JPanel p4 = new JPanel();
	JPanel p5 = new JPanel();
		
	JLabel lblinfo1 =new JLabel("SU1=");
	JLabel lblinfo2 =new JLabel("SU2=");
	JLabel lblinfo3 =new JLabel("RES=");
	
	JTextField tfdata1 =new JTextField(21);
	JTextField tfdata2 =new JTextField(21);
	JTextField tfdata3 =new JTextField(21);
	
	JButton btn5 = new JButton("종료");
	public MiniCalc(String title){
		super(title);
		display();
		setSize(295,210);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		eventStart();
	}
	private void eventStart() {
		MiniCalcListener listener = new MiniCalcListener(this);
		tfdata1.addActionListener(listener);
		tfdata2.addActionListener(listener);
		tfdata3.addActionListener(listener);
		p3.btn1.addActionListener(listener);
		p3.btn2.addActionListener(listener);
		p3.btn3.addActionListener(listener);
		p3.btn4.addActionListener(listener);	
		btn5.addActionListener(listener);	
		
	}
	
	public void display(){
		Container c = getContentPane();
		setLayout(new GridLayout(5,1));
		
		p1.setLayout(new FlowLayout());
		p1.add(lblinfo1);
		p1.add(tfdata1);
		add(p1);
		p2.setLayout(new FlowLayout());
		p2.add(lblinfo2);
		p2.add(tfdata2);
		add(p2);
		
		//p3은  사용자정의 패널에서 컴포넌트를 생성자에서 추가
		add(p3);
		
		p4.setLayout(new FlowLayout());
		p4.add(lblinfo3);
		p4.add(tfdata3);
		add(p4);
		p5.setLayout(new FlowLayout(btn5.RIGHT));
		p5.add(btn5);
		add(p5);	
		
		
	}
	public static void main(String[] args) {
		MiniCalc obj = new MiniCalc("Text 계산기");
	}
}