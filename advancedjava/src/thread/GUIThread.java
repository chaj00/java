package thread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIThread extends JFrame {
	JLabel  lblNum;
	public GUIThread(){
		super("쓰레드");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		int n = 0;
		lblNum = new JLabel(n+"");
		lblNum.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		c.add(lblNum);
		JButton btn = new JButton("쓰레드시작");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				print();
				
			}
		} );
		
		c.add(btn);
		setSize(300,150);
		setVisible(true);
	}
	
	public void print(){
		int n=0;
		while(n<=10){
			lblNum.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUIThread t = new GUIThread();
	}

}
