package homework;

public class Sparrow {
	private String name;
	private int legs;
	private int length;
	
	public Sparrow() {
	}
	public void sing(){
		System.out.println("참새("+this.name+")가 소리내어 웁니다.");
	}
	public void fly(){
		System.out.println("참새("+this.name+")는 날아다닙니다.");
	}
	public String toString(){
		String str ="참새의 이름은 "+this.name+" 입니다.";
		return str;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}
