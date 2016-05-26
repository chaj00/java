package jdbc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsertViewListener implements ActionListener{
	InsertView mainView;
	
	public InsertViewListener(InsertView mainView) {
		super();
		this.mainView = mainView;	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==mainView.btnInsert){
			String id = mainView.tfId.getText();
			String pass = mainView.tfPass.getText();
			String name = mainView.tfName.getText();
			String addr = mainView.tfAddr.getText();
			String memo = mainView.tfMemo.getText();

			if(id.length() ==0 | pass.length() == 0 | name.length() == 0 | addr.length() ==0){
				System.out.println("아이디, 패스워드 , 이름, 주소는 필수 입력사항입니다.");
				System.exit(3);
			}else {
				PreparedInsertTest pinsert = new PreparedInsertTest();
				pinsert.insert(id, pass, name, addr, memo);
			}	
		}
	}
}
