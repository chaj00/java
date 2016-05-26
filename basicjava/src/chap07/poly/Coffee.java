package chap07.poly;

public class Coffee extends Beverage {
	static int amount;
	
	public Coffee(){
	}
	public Coffee(String name){
		super(name);
		calcPrice();
		amount++;
	}
	@Override
	public void calcPrice() {
		switch(getName()){
			case "Americano":
				price =1500;
				break;
			case "CafeLatte":
				price = 2500;
				break;
			case "Cappuccino":
				price = 3000;
				break;
			default :
				break;
		}
	}
	public static int getAmount() {
		return amount;
	}
	public static void setAmount(int amount) {
		Coffee.amount = amount;
	}
	
	
	
}
