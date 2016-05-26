package view.dept;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DeptInsertPage extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the panel.
	 */
	public DeptInsertPage() {
		setLayout(null);
		
		JPanel DeptInsertPage = new JPanel();
		DeptInsertPage.setLayout(null);
		DeptInsertPage.setBounds(0, 0, 429, 208);
		add(DeptInsertPage);
		
		JLabel label = new JLabel("\uBD80\uC11C\uB4F1\uB85D");
		label.setFont(new Font("±¼¸²", Font.BOLD, 14));
		label.setBounds(184, 10, 65, 25);
		DeptInsertPage.add(label);
		
		JLabel label_1 = new JLabel("\uBD80\uC11C\uBC88\uD638:");
		label_1.setBounds(31, 48, 57, 15);
		DeptInsertPage.add(label_1);
		
		JLabel label_2 = new JLabel("\uBD80\uC11C\uBA85:");
		label_2.setBounds(31, 73, 57, 15);
		DeptInsertPage.add(label_2);
		
		JLabel label_3 = new JLabel("\uC704\uCE58:");
		label_3.setBounds(31, 98, 57, 15);
		DeptInsertPage.add(label_3);
		
		JLabel label_4 = new JLabel("\uC804\uD654\uBC88\uD638:");
		label_4.setBounds(31, 123, 57, 15);
		DeptInsertPage.add(label_4);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(102, 45, 259, 21);
		DeptInsertPage.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(102, 70, 259, 21);
		DeptInsertPage.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(102, 95, 259, 21);
		DeptInsertPage.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(102, 120, 259, 21);
		DeptInsertPage.add(textField_3);
		
		JButton button = new JButton("\uBD80\uC11C\uB4F1\uB85D");
		button.setBounds(288, 164, 97, 23);
		DeptInsertPage.add(button);

	}

}
