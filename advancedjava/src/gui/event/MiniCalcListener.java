package gui.event;

import gui.model.Calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class MiniCalcListener implements ActionListener {
	MiniCalc main;
	
	public MiniCalcListener(MiniCalc main){
		super();
		this.main = main;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==main.btn5){
			System.exit(0);
		}else{
			int su1 = Integer.parseInt(main.tfdata1.getText());
			int su2 = Integer.parseInt(main.tfdata2.getText());
			int result=0;
			Calc logic = new Calc();
			result =logic.calc(e.getActionCommand(), su1, su2);
			
			/*
			if(e.getSource()==main.p3.btn1){
				result = su1+su2;	
			}else if(e.getSource()==main.p3.btn2){
				result = su1-su2;
			}else if(e.getSource()==main.p3.btn3){
				result = su1*su2;
			}else if(e.getSource()==main.p3.btn4){
				result = su1/su2;
			} */
				
			main.tfdata3.setText(result+"");
		}
	}
}
