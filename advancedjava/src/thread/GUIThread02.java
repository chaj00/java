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
	//print()내부에서 처리하는 일을 쓰레드로 실행할수 있도록 구현
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
			System.out.println("쓰레드 종료");
		}
	}
}
public class GUIThread02 extends JFrame {
	//JFrame이 실행이 되면 JLabel의 값이 자동으로 변경되도록 구현
	//==> 생성자 내부에서 쓰레드를 생성하고 start()시키라는 의미
	JLabel  lblNum;
	public GUIThread02(){
		super("쓰레드");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		int n = 0;
		lblNum = new JLabel(n+"");
		lblNum.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(lblNum);
		PrintThread t1 = new PrintThread(lblNum);
		JButton btn = new JButton("쓰레드시작");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {			
				t1.start();
			}
		} );
		JButton btn2 = new JButton("쓰레드종료");
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
