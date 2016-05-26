package gui.event;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class ItemEventTest1 extends JFrame{
	JTextField text;
	JCheckBox bold, italic;
	JPanel p;

	public ItemEventTest1() {
		super("체크박스에서 ItemEvent 연습");

		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1));

		text = new JTextField("JAVA 연습");
		text.setFont(new Font("굴림", Font.PLAIN, 18)); // PLAIN = 보통체, 18포인트 크기
		c.add(text);

		p = new JPanel();
		bold = new JCheckBox("진하게");
		p.add(bold);
		italic = new JCheckBox("기울임");
		p.add(italic);
		c.add(p);
	
		//이벤트 설정
		ItemEventTest1Listener listener = new ItemEventTest1Listener(this);
		
		italic.addItemListener(listener);
		bold.addItemListener(listener);
		
		setSize(250, 100);
		setVisible(true);

	}

	public static void main(String args[]) {

		ItemEventTest1 item = new ItemEventTest1();
		
	}

	
}












