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
			System.out.println("전송");
			//JTextField에 입력한 JTextArea에 출력하는 내용을 구현
			//JTextField에 입력한 내용을 읽어오기
			//JTextArea에 출력하기
			main.content.append(main.text.getText()+"\n");
			main.text.setText("");
		}
	}
}
