package view.dept;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.CardLayout;

import gui.tool.Page1;

public class InsaMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsaMain frame = new InsaMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InsaMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 434, 298);
		contentPane.add(tabbedPane);
		
		JPanel tabdept = new JPanel();
		tabbedPane.addTab("\uBD80\uC11C\uC815\uBCF4", null, tabdept, null);
		tabdept.setLayout(null);
		
		JPanel p1dept = new JPanel();
		p1dept.setBounds(0, 0, 429, 63);
		tabdept.add(p1dept);
		p1dept.setLayout(null);
		
		JButton btnNewButton = new JButton("\uBD80\uC11C\uB4F1\uB85D");
		btnNewButton.setBounds(12, 10, 121, 23);
		p1dept.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uBD80\uC11C\uC870\uD68C");
		btnNewButton_1.setBounds(145, 10, 121, 23);
		p1dept.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uBD80\uC11C\uC778\uC6D0\uBCC4\uC870\uD68C");
		btnNewButton_2.setBounds(278, 10, 120, 23);
		p1dept.add(btnNewButton_2);
		
		JPanel p2dept = new JPanel();
		p2dept.setBounds(0, 61, 429, 208);
		tabdept.add(p2dept);
		p2dept.setLayout(new CardLayout(0, 0));
		
		DeptInsertPage deptInsertPage = new DeptInsertPage();
		p2dept.add(deptInsertPage, "name_1149871206085897");
		
		JPanel page2dept = new JPanel();
		p2dept.add(page2dept, "name_1148219423199148");
		page2dept.setLayout(null);
		
		JPanel page3dept = new JPanel();
		p2dept.add(page3dept, "name_1148219432791207");
		page3dept.setLayout(null);
		
		JPanel tabemp = new JPanel();
		tabbedPane.addTab("\uC0AC\uC6D0\uC815\uBCF4", null, tabemp, null);
	}

}
