package gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest02 {

	public static void main(String[] args) {
		JFrame f = new JFrame("��������");
		//1. ������Ʈ�� �̿��ؼ� JFrame�� ������ �ϱ� ���ؼ� ������Ʈ�� �÷����� �� �ִ� ContentPane�� �־�� �Ѵ�.
		//	 JFrame���� ���� ���� �۾��Ѵ�.
		Container c = f.getContentPane();
		
		//2. ȭ�鿡 ��ġ�� ������Ʈ�� ����
		JButton btn1 = new JButton("�ȳ�");
		JButton btn2 = new JButton("swing");
		JButton btn3 = new JButton("�۾��Ϸ�");
		
		c.add(btn1);
		c.add(btn2);
		c.add(btn3);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(400,500);
		f.setVisible(true);

	}

}
