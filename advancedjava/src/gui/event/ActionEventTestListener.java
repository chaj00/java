package gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventTestListener implements ActionListener {
	ActionEventTest main;
	
	public ActionEventTestListener(ActionEventTest main) {
		super();
		this.main = main;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==main.text | e.getSource()==main.send){
			System.out.println("����");
			//JTextField�� �Է��� JTextArea�� ����ϴ� ������ ����
			//JTextField�� �Է��� ������ �о����
			//JTextArea�� ����ϱ�
			main.content.append(main.text.getText()+"\n");
			main.text.setText("");
		}
	}
}
