package gui.event;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class ActionEventTest extends JFrame{ 
	JTextField text;
	JButton send ;
	JTextArea content;
	public ActionEventTest(){
		super("ActionEvent연습");
		
		display();
		eventStart();
		this.setSize(350, 200);
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	private void eventStart() {
		ActionEventTestListener listener = new ActionEventTestListener(this);
		text.addActionListener(listener);
		send.addActionListener(listener);
		
	}
	public void display(){
		Container c = this.getContentPane();
		content = new JTextArea(5,30);
		JScrollPane scroll = new JScrollPane(content);
		c.add(scroll,BorderLayout.CENTER);
		JPanel p1 = new JPanel();
		JLabel label = new JLabel("내용");
		text = new JTextField(20);
		send = new JButton("전송");
		p1.add(label);
		p1.add(text);
		p1.add(send);
		c.add(p1,BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		ActionEventTest f = 
				new ActionEventTest();
	}
}












