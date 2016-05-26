package gui.model;

import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class ItemEventExamLogic02 {
	public class ItemEventExamLogic {
		public int run(int count, JToggleButton[] menu,int selectPrice, int[] priceArr){
			int price = selectPrice;
			for (int i=0; i<count;i++){
				if(menu[i].isSelected()){
					if(menu[i] instanceof JRadioButton){
						price = priceArr[i];
					}else{
						price = price + priceArr[i];
					}
					
				}
			}
			return price;
		}
		
	}

}
