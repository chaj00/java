package homework;

public class Sparrow {
	private String name;
	private int legs;
	private int length;
	
	public Sparrow() {
	}
	public void sing(){
		System.out.println("����("+this.name+")�� �Ҹ����� ��ϴ�.");
	}
	public void fly(){
		System.out.println("����("+this.name+")�� ���ƴٴմϴ�.");
	}
	public String toString(){
		String str ="������ �̸��� "+this.name+" �Դϴ�.";
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
