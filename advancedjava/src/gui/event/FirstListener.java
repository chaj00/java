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
		//System.out.println("��ư�� ������~~~");
		//System.out.println(e.toString());
		//System.out.println(e.getActionCommand());
		//System.out.println(e.getSource());
		
		//getActionCommand�� Ȱ��- �̺�Ʈ �ҽ� ��ü�� ���� �ִ� ���ڿ��� ����
		if(e.getActionCommand().equals("NORTH")){
			System.out.println("����~~~~");
		}else if(e.getActionCommand().equals("WEST")){
			System.out.println("����~~~~!");
		}
		
		//getSource�� Ȱ�� - �̺�Ʈ�� �߻���Ų �ҽ���ü(�̺�Ʈ �ҽ� ��ü�� �Ҵ�� �޸� �ּ�)�� ����
		if(e.getSource()==main.btn4){
			System.out.println("East ��ư�� ��������.");
		}else if(e.getSource()==main.btn5){
			System.out.println("Center ��ư�� ��������.");
		}
	}
	

}
