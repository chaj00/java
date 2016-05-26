package chap09;

public class Vehicle {
	private Owner owner = new Owner();
	private int price;
	
	public Vehicle(){
	}
	
	public boolean equals(Object obj){
		Vehicle v1 = (Vehicle)obj;
		return this.owner.equals(v1.owner);
		
	}
	public String toString(){
		return this.owner.toString()+"\n차량정보: 가격은 "+this.price;
	}

	public Owner getOwner() {
		return this.owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
