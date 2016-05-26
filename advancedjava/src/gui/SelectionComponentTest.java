package gui;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SelectionComponentTest extends JFrame{
	//1. JCheckBox
	JCheckBox chkjava = new JCheckBox("���");
	JCheckBox chkweb = new JCheckBox("��");
	JCheckBox chkspring = new JCheckBox("������");
	
	//2. JRadioButton
	/*	=> ���� �׷�ȿ��� �ϳ��� ���õǵ��� ����
	 *  1) �߰��� JRadioButton�� �ۼ��ϱ�
	 *  2) JRadioButton�� ButtonGroup�� ����� �߰��Ͽ� ���� �׷����� ����
	 */
	ButtonGroup group1 = new ButtonGroup();
	JRadioButton rdojava = new JRadioButton("�ڹ�");
	JRadioButton rdoweb = new JRadioButton("��");
	JRadioButton rdospring = new JRadioButton("������");
	
	//3. JComboBox�� JList�� add�� ���ڿ�
	String[] data1 = {"java", "sevlet", "mongodb", "hadoop", "spark"};
	String[] data2 = {"hive", "iot", "spring", "pig", "storm"};
	JComboBox cbosubject = new JComboBox(data1);
	JList lstsubject = new JList(data2); 
	
	public SelectionComponentTest(String title){
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void display(){
		Container c = getContentPane();
		setLayout(new FlowLayout());
		
		c.add(chkjava);
		c.add(chkweb);
		c.add(chkspring);
		
		//JRadioButton���� ���� �׷����� �����ֱ�
		group1.add(rdojava);
		group1.add(rdoweb);
		group1.add(rdospring);
		c.add(rdojava);
		c.add(rdoweb);
		c.add(rdospring);
		
		//JList�� ������ ������ ��� ��ũ�ѹٸ� �߰��Ѵ�.
		//=> ��ũ���� �߰��ϴ� ��� ��ũ�ѿ� ������Ʈ�� ��� ��ũ���� ContentPane�� �߰��Ѵ�.
		JScrollPane scrollPane = new JScrollPane(lstsubject);
		lstsubject.setVisibleRowCount(3);
		c.add(scrollPane);
		//c.add(cbosubject);
		//c.add(lstsubject);
		
		//JTextArea
		JTextArea ta = new JTextArea(10,10);
		JScrollPane scrollPane2 = new JScrollPane(ta);
		lstsubject.setVisibleRowCount(3);
		c.add(scrollPane2);
	}
	
	public static void main(String[] args) {
		SelectionComponentTest obj = new SelectionComponentTest("�������̾ƿ� �Ŵ���");
		

	}

}