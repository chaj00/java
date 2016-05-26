package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BasicComponentTest extends JFrame{
	JLabel lblinfo =new JLabel("Info:");
	JTextField tfdata1 =new JTextField();
	JTextField tfdata2 =new JTextField(10);
	JTextField tfdata3 =new JTextField("[이곳에 데이터를 입력하세요]");
	ImageIcon iconCheck=new ImageIcon("src/images/check.png");
	JButton btncheck = new JButton(iconCheck);
	JButton btnsoundoff = new JButton("추가",new ImageIcon("src/images/sound_off.png"));
	JTextArea taInfo = new JTextArea(7,30);
	
	public BasicComponentTest(String title){
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void display(){
		Container c = getContentPane();
		
		setLayout(new FlowLayout());
		btncheck.setToolTipText("체크하기");
		btnsoundoff.setRolloverIcon(new ImageIcon("src/images/str.png"));
		c.add(lblinfo);
		c.add(tfdata1);
		c.add(tfdata2);
		c.add(tfdata3);
		c.add(btncheck);
		c.add(btnsoundoff);
		c.add(taInfo);
		

	}
	
	public static void main(String[] args) {
		BasicComponentTest obj = new BasicComponentTest("보더레이아웃 매니저");
		

	}

}