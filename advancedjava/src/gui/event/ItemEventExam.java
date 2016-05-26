package gui.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ItemEventExam extends JFrame{
	JLabel lbltitle = new JLabel("메뉴판");
	JLabel lblmain = new JLabel("주메뉴:");
	JLabel lblsub = new JLabel("추가메뉴:");
	JLabel lblprice = new JLabel("금액:");
	ButtonGroup group1 = new ButtonGroup();
	JRadioButton rbomenu1 = new JRadioButton("치킨카레라이스");
	JRadioButton rbomenu2 = new JRadioButton("기본카레라이스");
	JRadioButton rbomenu3 = new JRadioButton("야채카레라이스");
	
	JCheckBox chkmenu1 = new JCheckBox("치즈");
	JCheckBox chkmenu2 = new JCheckBox("해시포테이토");
	JCheckBox chkmenu3 = new JCheckBox("소세지");	
	JCheckBox chkmenu4 = new JCheckBox("돈까스");
	JCheckBox chkmenu5 = new JCheckBox("치킨까스");
	JCheckBox chkmenu6 = new JCheckBox("포테이토");
	JTextField tfPrice = new JTextField(20);
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JPanel p3 = new JPanel();
	JPanel centerPanel = new JPanel();
	
	
	public ItemEventExam(String title){
		super(title);
		display();
		startEvent();
		setSize(370, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void startEvent() {
		ItemEventExamListener02 listener = new ItemEventExamListener02(this);
		
		rbomenu1.addItemListener(listener);
		rbomenu2.addItemListener(listener);
		rbomenu3.addItemListener(listener);
		
		chkmenu1.addItemListener(listener);
		chkmenu2.addItemListener(listener);
		chkmenu3.addItemListener(listener);
		chkmenu4.addItemListener(listener);
		chkmenu5.addItemListener(listener);
		chkmenu6.addItemListener(listener);
		
		
		
	}
	public void display(){
		//1. 컴포넌트를 배치할 ContentPane을 얻는다.
		Container c = getContentPane();
		lbltitle.setFont(new Font("굴림",Font.BOLD,18));
		c.add(lbltitle,BorderLayout.NORTH);
		
		p1.setLayout(new GridLayout(5, 1));
		group1.add(rbomenu1);
		group1.add(rbomenu2);
		group1.add(rbomenu3);
		
		p1.add(lblmain);
		p1.add(rbomenu1);
		p1.add(rbomenu2);
		p1.add(rbomenu3);
		p1.add(lblsub);
		
		p2.setLayout(new GridLayout(3, 2));
		p2.add(chkmenu1);
		p2.add(chkmenu2);
		p2.add(chkmenu3);
		p2.add(chkmenu4);
		p2.add(chkmenu5);
		p2.add(chkmenu6);
		
		centerPanel.add(p1);
		centerPanel.add(p2);
		centerPanel.setLayout(new GridLayout(2, 1));
		c.add(centerPanel,BorderLayout.CENTER);
		
		p3.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p3.add(lblprice);
		p3.add(tfPrice);
		c.add(p3,BorderLayout.SOUTH);
		
	}
	public static void main(String[] args) {
		ItemEventExam obj  = new ItemEventExam("ItemEventExam");

	}

}


