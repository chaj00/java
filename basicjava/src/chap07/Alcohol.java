package chap07;

public class Alcohol extends Drink {
	private double alcper;

	public Alcohol(){
		super();
	}
	public Alcohol(String name, int price, int count, double alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}
	
	public static void printTitle(){
		System.out.println("��ǰ��(����[%])\t�ܰ�\t����\t�ݾ�");
	}
	public void printData(){
		System.out.println(super.getName()+(this.alcper)+"\t\t"+super.getPrice()
										  +"\t"+super.getCount()+"\t"+super.getTotalPrice());
		
	}
	
	public double getAlcper() {
		return alcper;
	}
	public void setAlcper(double alcper) {
		this.alcper = alcper;
	}
}
