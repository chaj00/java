package gui;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutTest02 extends JFrame{
	String[] data = new String[]{"1","2","3","4","5","6","7"};
	JButton[] btnArr = new JButton[data.length] ;
	
	
	
	public GridLayoutTest02(String title){
		super(title);
		display();
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void display(){
		Container c = getContentPane();
		
		setLayout(new GridLayout(2, 3,10,10));
		for(int i=0;i<btnArr.length;i++){
			btnArr[i]= new JButton(data[i]);
			c.add(btnArr[i]);
		}


	}
	
	public static void main(String[] args) {
		GridLayoutTest02 obj = new GridLayoutTest02("보더레이아웃 매니저");
		

	}

}