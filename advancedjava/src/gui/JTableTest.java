package gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

public class JTableTest extends JFrame{
	
	
	public JTableTest(String title){
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void display(){
		Container c = getContentPane();
		String[] columnNames = {"�����ȣ", "�����", "�μ���"};
		String[][] rowData = {
				{"001","�嵿��","�λ��"},
				{"002","�̹�ȣ","������"},
				{"003","�����","ȫ����"},
				{"004","���ؿ�","ȫ����"},
				{"005","�輭��","�����"},
			};
		JTable table = new JTable(rowData, columnNames);
		c.add(table);
	}
	
	public static void main(String[] args) {
		JTableTest obj = new JTableTest("�������̾ƿ� �Ŵ���");
		

	}

}