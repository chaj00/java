package thread;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Horse extends Canvas implements Runnable{
	private int x = 0;
	private int randNum ;
	public Horse(){
		double su = Math.random();
		randNum = (int)(su*5);
	}
	public void paint(Graphics g){
		setBackground(Color.yellow);//Canvas에 색상지정
		g.drawLine(0, this.getSize().height/2,
				this.getSize().width,
				this.getSize().height/2);
		g.fillOval(x, 0, 10, this.getSize().height);
	}
	public void startThread(){
		new Thread(this).start();
	}
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//캔버스의 x좌표값을 변경하는 코드
			x = x+10+randNum;
			//x좌표값이 캔버스의 width보다 커지면 반복문 빠져나간다. 
			if(x>this.getSize().width-10){
				break;
			}
			repaint();//Canvas의 paint()를 호출한다.
		}
	}
	
	
}

public class HorseGame extends Frame implements ActionListener{
	private BorderLayout bl = new BorderLayout();
	private Label lb = new Label("말 수 = ", Label.RIGHT);
	private TextField tf = new TextField(10);
	private Button bt = new Button("설정");
	public List li = new List(3, false);
	private Panel pp;
	private Horse[] horse;
	private Button bt1 = new Button("출발하기");
	public HorseGame(){
		super("ActionEvent연습");
		init();
		start();
		this.setSize(600,500);
		this.setVisible(true);
	}
	public void init(){
		this.setLayout(bl);
		Panel p = new Panel(new FlowLayout());
		p.add(lb);
		p.add(tf);
		p.add(bt);
		p.add(bt1);
		this.add("North", p);
		
		this.add("South", li);
	}
	public void start(){
		tf.addActionListener(this);
		bt.addActionListener(this);
		bt1.addActionListener(this);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==tf||e.getSource()==bt){
			//텍스트필드에 입력하는 말의 개수만큼 말을 만드는 작업
			//---> 버튼을 누르거나 텍스트필드에서 Enter를 누르면 수행
			if(pp!=null){
				this.remove(pp);
			}
			int x = Integer.parseInt(tf.getText().trim());
			pp = new Panel();
			pp.setLayout(new GridLayout(x,1,3,3));
			horse = new Horse[x];
			for (int i = 0; i < x; i++) {
				horse[i] = new Horse();
				pp.add(horse[i]);
			}
			this.add("Center",pp);
			this.validate();//화면을 재구성
		}else if(e.getSource()==bt1){
			for (int i = 0; i < horse.length; i++) {
				horse[i].startThread();
			}
		}
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		HorseGame g =new  HorseGame();

	}
}













