package gui.event;



import gui.model.ItemEventExamLogic02;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

public class ItemEventExamListener02 implements ItemListener{
	ItemEventExam mainView;
	int[] mainPrice = {9000,7000,8000};
	int[] subPrice = {1500,2000,2500,3000,3000,1000};
	JRadioButton[] mainMenu = new JRadioButton[3];
	JCheckBox[] subMenu = new JCheckBox[6];
	
	public ItemEventExamListener02(ItemEventExam mainView) {
		super();
		this.mainView = mainView;
		init();
	}
	
	private void init() {
		mainMenu[0] = mainView.rbomenu1;
		mainMenu[1] = mainView.rbomenu2;
		mainMenu[2] = mainView.rbomenu3;
		
		subMenu[0] = mainView.chkmenu1;
		subMenu[1] = mainView.chkmenu2;
		subMenu[2] = mainView.chkmenu3;
		subMenu[3] = mainView.chkmenu4;
		subMenu[4] = mainView.chkmenu5;
		subMenu[5] = mainView.chkmenu6;
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int mainMenuPrice = 0;
		int subMenuPrice = 0;
		int total = 0;
		ItemEventExamLogic02 logic = new ItemEventExamLogic02();
	
		//mainMenuPrice = logic.run(mainMenu.length, mainMenu, mainMenuPrice,mainPrice);
		//subMenuPrice = logic.run(subMenu.length, subMenu, subMenuPrice, subPrice);
		total = mainMenuPrice+subMenuPrice;
		System.out.println(total);
		mainView.tfPrice.setText(total+"");
		
	}
	
}
