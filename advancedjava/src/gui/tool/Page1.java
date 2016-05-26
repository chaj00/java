package gui.tool;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Page1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Page1() {
		setLayout(null);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(42, 5, 97, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(172, 5, 97, 23);
		add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(303, 5, 97, 23);
		add(btnNewButton_2);

	}

}
