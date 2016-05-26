package thread;

import java.awt.Container;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class PrintThread extends Thread{
	//print()���ο��� ó���ϴ� ���� ������� �����Ҽ� �ֵ��� ����
	JLabel lblNum;
	public PrintThread(JLabel lblNum) {
		super();
		this.lblNum = lblNum;
	}
	public void run(){
		int n=0;
		try {
			while(!Thread.currentThread().isInterrupted()){
				lblNum.setText(Integer.toString(n));
				n++;
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		} finally{
			System.out.println("������ ����");
		}
	}
}
public class GUIThread02 extends JFrame {
	//JFrame�� ������ �Ǹ� JLabel�� ���� �ڵ����� ����ǵ��� ����
	//==> ������ ���ο��� �����带 �����ϰ� start()��Ű��� �ǹ�
	JLabel  lblNum;
	public GUIThread02(){
		super("������");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		int n = 0;
		lblNum = new JLabel(n+"");
		lblNum.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(lblNum);
		PrintThread t1 = new PrintThread(lblNum);
		JButton btn = new JButton("���������");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {			
				t1.start();
			}
		} );
		JButton btn2 = new JButton("����������");
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				t1.interrupt();
			}
		} );
		
		c.add(btn);
		c.add(btn2);
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUIThread02 t = new GUIThread02();
	}
}
