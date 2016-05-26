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
	JCheckBox chkjava = new JCheckBox("쟈바");
	JCheckBox chkweb = new JCheckBox("웹");
	JCheckBox chkspring = new JCheckBox("스프링");
	
	//2. JRadioButton
	/*	=> 같은 그룹안에서 하나만 선택되도록 설정
	 *  1) 추가될 JRadioButton을 작성하기
	 *  2) JRadioButton을 ButtonGroup을 만들고 추가하여 같은 그룹으로 묶기
	 */
	ButtonGroup group1 = new ButtonGroup();
	JRadioButton rdojava = new JRadioButton("자바");
	JRadioButton rdoweb = new JRadioButton("웹");
	JRadioButton rdospring = new JRadioButton("스프링");
	
	//3. JComboBox와 JList에 add될 문자열
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
		
		//JRadioButton들을 같은 그룹으로 묶어주기
		group1.add(rdojava);
		group1.add(rdoweb);
		group1.add(rdospring);
		c.add(rdojava);
		c.add(rdoweb);
		c.add(rdospring);
		
		//JList에 내용이 많아질 경우 스크롤바를 추가한다.
		//=> 스크롤을 추가하는 경우 스크롤에 컴포넌트를 담아 스크롤을 ContentPane에 추가한다.
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
		SelectionComponentTest obj = new SelectionComponentTest("보더레이아웃 매니저");
		

	}

}