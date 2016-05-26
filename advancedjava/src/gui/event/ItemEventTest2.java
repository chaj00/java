package gui.event;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ItemEventTest2 extends JFrame{
	JTextField tex;
	JRadioButton m, f;
	JPanel p;
	ButtonGroup gender;

	public ItemEventTest2() {
		super("라디오버튼에서 ItemEvent 연습");

		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1));

		tex = new JTextField("성별을 표시합니다.");
		tex.setFont(new Font("굴림", Font.PLAIN, 16));
		c.add(tex);

		p = new JPanel();
		m = new JRadioButton("남자(Male)");
		p.add(m);
		f = new JRadioButton("여자(Female)");
		p.add(f);
		c.add(p);
		
		ItemEventTest2Listener listener = new ItemEventTest2Listener(this);
		m.addItemListener(listener);
		f.addItemListener(listener);
		

		gender = new ButtonGroup();
		gender.add(m);
		gender.add(f);
	
		setSize(250, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String args[]) {
		ItemEventTest2 item = new ItemEventTest2();
		
	}


}











