package chap07.poly;

public class Tea extends Beverage {
	static int amount;
	
	public Tea(){
	}
	public Tea(String name){
		super(name);
		calcPrice();
		amount++;
	}
	@Override
	public void calcPrice() {
		switch(getName()){
		case "lemonTea":
			price =1500;
			break;
		case "ginsengTea":
			price = 2000;
			break;
		case "redginsengTea":
			price = 2500;
			break;
		default :
			break;
		}
	}
}