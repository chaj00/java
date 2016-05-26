package jdbc;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class InsertView extends JFrame {

	JPanel contentPane;
	public JTextField tfName;
	public JTextField tfAddr;
	public JTextField tfMemo;
	public JTextField tfPass;
	public JTextField tfId;
	public JButton btnInsert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InsertView frame = new InsertView();
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
	public InsertView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 301);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfId = new JTextField();
		tfId.setBounds(105, 34, 116, 21);
		contentPane.add(tfId);
		tfId.setColumns(10);
		
		tfPass = new JTextField();
		tfPass.setColumns(10);
		tfPass.setBounds(105, 64, 116, 21);
		contentPane.add(tfPass);
		
		tfName = new JTextField();
		tfName.setColumns(10);
		tfName.setBounds(105, 95, 116, 21);
		contentPane.add(tfName);
		
		tfAddr = new JTextField();
		tfAddr.setColumns(10);
		tfAddr.setBounds(105, 126, 116, 21);
		contentPane.add(tfAddr);
		
		tfMemo = new JTextField();
		tfMemo.setColumns(10);
		tfMemo.setBounds(105, 158, 116, 21);
		contentPane.add(tfMemo);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("µ¸¿ò", Font.BOLD, 14));
		lblId.setBounds(8, 36, 57, 15);
		contentPane.add(lblId);
		
		JLabel lblPass = new JLabel("PW");
		lblPass.setFont(new Font("µ¸¿ò", Font.BOLD, 14));
		lblPass.setBounds(8, 67, 57, 15);
		contentPane.add(lblPass);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("µ¸¿ò", Font.BOLD, 14));
		lblName.setBounds(8, 98, 57, 15);
		contentPane.add(lblName);
		
		JLabel lblAddr = new JLabel("ADDR");
		lblAddr.setFont(new Font("µ¸¿ò", Font.BOLD, 14));
		lblAddr.setBounds(8, 129, 57, 15);
		contentPane.add(lblAddr);
		
		JLabel lblMemo = new JLabel("MEMO");
		lblMemo.setFont(new Font("µ¸¿ò", Font.BOLD, 14));
		lblMemo.setBounds(8, 160, 57, 15);
		contentPane.add(lblMemo);
		
		btnInsert = new JButton("\uAC00\uC785");
		btnInsert.setBounds(124, 228, 97, 23);
		contentPane.add(btnInsert);
		
		InsertViewListener listener = new InsertViewListener(this);
		btnInsert.addActionListener(listener);
		
		
	}

}
