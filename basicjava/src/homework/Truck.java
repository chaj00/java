package homework;

public class Truck extends Wheeler{
	public Truck(String carName, int velocity, int wheelNumber){
		super(velocity, carName, wheelNumber);
	}
	
	public void speedUp(int speed){
		velocity = velocity+speed*5;
		if(velocity>100){
			velocity=100;
			System.out.println(carName+"�� �ְ�ӵ��������� �ӵ��� "+velocity+"���� �����ϴ�.");
		}else{
			System.out.println(carName+"�� ���� �ӵ��� "+velocity+" �Դϴ�.");
		}
	}
	public void speedDown(int speed) {
		velocity = velocity-speed*5;
		if(velocity<50){
			velocity=50;
			System.out.println(carName+"�� �����ӵ��������� �ӵ��� "+velocity+"���� �ø��ϴ�.");
		}else{
			System.out.println(carName+"�� ���� �ӵ��� "+velocity+" �Դϴ�.");
		}
	}
}
