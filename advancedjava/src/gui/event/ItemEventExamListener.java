package gui.event;

import gui.model.ItemEventExamLogic;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


import javax.swing.JRadioButton;

public class ItemEventExamListener implements ActionListener, ItemListener {
	ItemEventExam main;
	
	int mainPriceChi = 9000;
	int mainPriceBas = 7000;
	int mainPriceVeg = 8000;
	int subPriceChe = 1500;
	int subPriceHas	= 2000;
	int subPriceSau = 2500;
	int subPriceDon	= 3000;
	int subPriceChi	= 3000;
	int subPricePot	= 1000;
	
	int total =0;
	int price =0;
	
	public ItemEventExamListener(ItemEventExam main) {
		super();
		this.main = main;
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String opr = null;
		ItemEventExamLogic logic = new ItemEventExamLogic();
		
		if(e.getStateChange()== ItemEvent.SELECTED){
			opr ="+";
		}else{
			opr="-";
		}
					
		if(e.getSource()==main.chkmenu1){	
			price = subPriceChe;			
		}else if(e.getSource()==main.chkmenu2){
			price = subPriceHas;		
		}else if(e.getSource()==main.chkmenu3){
			price = subPriceSau;			
		}else if(e.getSource()==main.chkmenu4){	
			price = subPriceDon;			
		}else if(e.getSource()==main.chkmenu5){
			price = subPriceChi;
		}else if(e.getSource()==main.chkmenu6){
			price = subPricePot;
		}else if(e.getSource()==main.rbomenu1){
			price = mainPriceChi;
		}else if(e.getSource()==main.rbomenu2){
			price = mainPriceBas;
		}else if(e.getSource()==main.rbomenu3){
			price = mainPriceVeg;			
		}

		total = logic.calcTotalPrice(opr,total,price);
		main.tfPrice.setText(total+"");	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	}
}
