package chap07.poly;

public abstract class Beverage {
	private String name;
	protected int price;
	
	public Beverage(){
	}
	public Beverage(String name){
		this.name = name;
	}
	
	public void print(){
		System.out.println("���� �Ǹ� ����� "+getName()+"�̸�, ������ "+price);
	}
		
	public abstract void calcPrice();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
}
