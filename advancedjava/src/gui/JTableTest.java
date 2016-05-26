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
		String[] columnNames = {"사원번호", "사원명", "부서명"};
		String[][] rowData = {
				{"001","장동건","인사부"},
				{"002","이민호","영업부"},
				{"003","김범룡","홍보팀"},
				{"004","류준열","홍보팀"},
				{"005","김서연","전산실"},
			};
		JTable table = new JTable(rowData, columnNames);
		c.add(table);
	}
	
	public static void main(String[] args) {
		JTableTest obj = new JTableTest("보더레이아웃 매니저");
		

	}

}