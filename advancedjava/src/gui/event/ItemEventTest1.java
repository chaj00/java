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
		super("üũ�ڽ����� ItemEvent ����");

		Container c = getContentPane();
		c.setLayout(new GridLayout(2, 1));

		text = new JTextField("JAVA ����");
		text.setFont(new Font("����", Font.PLAIN, 18)); // PLAIN = ����ü, 18����Ʈ ũ��
		c.add(text);

		p = new JPanel();
		bold = new JCheckBox("���ϰ�");
		p.add(bold);
		italic = new JCheckBox("�����");
		p.add(italic);
		c.add(p);
	
		//�̺�Ʈ ����
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












