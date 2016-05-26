package gui.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstListener implements ActionListener{
	FirstEventGUI main;
	

	public FirstListener(FirstEventGUI main) {
		super();
		this.main = main;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("버튼이 눌려짐~~~");
		//System.out.println(e.toString());
		//System.out.println(e.getActionCommand());
		//System.out.println(e.getSource());
		
		//getActionCommand를 활용- 이벤트 소스 객체가 갖고 있는 문자열을 리턴
		if(e.getActionCommand().equals("NORTH")){
			System.out.println("북쪽~~~~");
		}else if(e.getActionCommand().equals("WEST")){
			System.out.println("서쪽~~~~!");
		}
		
		//getSource를 활용 - 이벤트를 발생시킨 소스객체(이벤트 소스 객체가 할당된 메모리 주소)를 리턴
		if(e.getSource()==main.btn4){
			System.out.println("East 버튼이 눌려졌다.");
		}else if(e.getSource()==main.btn5){
			System.out.println("Center 버튼이 눌려졌다.");
		}
	}
	

}
