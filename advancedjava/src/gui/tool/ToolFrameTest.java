package gui.tool;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ToolFrameTest extends JFrame {

	private JPanel contentPane;
	private JTextField tfnum1;
	private JTextField tfnum2;
	private JButton btnNewButton;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToolFrameTest frame = new ToolFrameTest();
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
	public ToolFrameTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnum1 = new JLabel("\uC22B\uC7901");
		lblnum1.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblnum1.setBounds(12, 10, 122, 33);
		contentPane.add(lblnum1);
		
		tfnum1 = new JTextField();
		tfnum1.setBounds(69, 15, 304, 26);
		contentPane.add(tfnum1);
		tfnum1.setColumns(10);
		
		JLabel lblnum2 = new JLabel("\uC22B\uC7902");
		lblnum2.setFont(new Font("±¼¸²", Font.BOLD, 14));
		lblnum2.setBounds(12, 53, 122, 33);
		contentPane.add(lblnum2);
		
		tfnum2 = new JTextField();
		tfnum2.setColumns(10);
		tfnum2.setBounds(69, 53, 106, 26);
		contentPane.add(tfnum2);
		
		btnNewButton = new JButton("+");
		btnNewButton.setBounds(22, 96, 97, 50);
		contentPane.add(btnNewButton);
		
		button = new JButton("-");
		button.setBounds(22, 156, 97, 50);
		contentPane.add(button);
	}
}
