package gui.model;

public class ItemEventExamLogic {

	public static void main(String[] args) {
		

	}
	
	public int calcTotalPrice(String opr, int total, int price){
		int result=0;
		switch(opr){
			case "+":
				result = total + price;
				break;
			case "-":
				result = total - price;
				break;
			default :
				break;
		}
		
		return result;
	}

}
