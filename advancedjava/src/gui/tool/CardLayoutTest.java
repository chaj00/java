package gui.tool;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class CardLayoutTest extends JFrame {

	JPanel contentPane;
	public JButton btnpre;
	public JButton btnnext;
	public JPanel p2;
	public CardLayout card;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutTest frame = new CardLayoutTest();
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
	public CardLayoutTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 434, 66);
		contentPane.add(p1);
		p1.setLayout(null);
		
		btnpre = new JButton("\uC774\uC804");
		btnpre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnpre.setBounds(67, 10, 117, 46);
		p1.add(btnpre);
		
		btnnext = new JButton("\uB2E4\uC74C");
		btnnext.setBounds(232, 10, 117, 46);
		p1.add(btnnext);
		
		p2 = new JPanel();
		p2.setBounds(0, 64, 434, 197);
		contentPane.add(p2);
		card = new CardLayout(0, 0);
		p2.setLayout(card);
		
		Page1 page1 = new Page1();
		p2.add(page1, "page1");
		
		JPanel page2 = new JPanel();
		p2.add(page2, "page3");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		page2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
		page2.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
		page2.add(rdbtnNewRadioButton_2);
		
		JPanel page3 = new JPanel();
		p2.add(page3, "mypage3");
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		page3.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		page3.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("New check box");
		page3.add(chckbxNewCheckBox_2);
		
		card.show(p2, "mypage3");
		CardLayoutTestListener listener = new CardLayoutTestListener(this);
		btnpre.addActionListener(listener);
		btnnext.addActionListener(listener);
	}
}
