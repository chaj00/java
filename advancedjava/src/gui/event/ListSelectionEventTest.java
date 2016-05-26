package gui.event;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListSelectionEventTest extends JFrame{
	JTextField text1 = new JTextField(10);
	JTextField text2 = new JTextField(10);
	
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	String[] subjectData = {"java","jdbc","servlet","android"
			,"spring"};
	String[] movieData = {"��Ŭ����","Ȱ","�±ر��ֳ�����","����"
			,"Ʈ���϶���"};
	
	JList movie = new JList(movieData);
	JComboBox subject = new JComboBox(subjectData);
	
	public ListSelectionEventTest(){
		super("ListSelectionEventTest�׽�Ʈ");
		startEvent();
		display();
		this.setSize(300, 200);
		this.setVisible(true);
	}
	private void startEvent() {
		ListSelectionEventTestListener listener = new ListSelectionEventTestListener(this); 
		
		movie.addListSelectionListener(listener);
		subject.addActionListener(listener);
	}
	public void display(){
		setLayout(new GridLayout(1, 2,10,10));
		
		this.add(movie);
	    
		p1.setLayout(new BorderLayout(10,10));
		p1.add(subject,BorderLayout.NORTH);
		
		p2.add(text1);
		p2.add(text2);
		p1.add(p2,BorderLayout.CENTER);
		this.add(p1);
	}

		

	public static void main(String[] args) {
		ListSelectionEventTest f = new ListSelectionEventTest();
	}
	
	
	
	
}








