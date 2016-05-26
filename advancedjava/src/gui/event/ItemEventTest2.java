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
		super("������ư���� ItemEvent ����");

		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1));

		tex = new JTextField("������ ǥ���մϴ�.");
		tex.setFont(new Font("����", Font.PLAIN, 16));
		c.add(tex);

		p = new JPanel();
		m = new JRadioButton("����(Male)");
		p.add(m);
		f = new JRadioButton("����(Female)");
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











