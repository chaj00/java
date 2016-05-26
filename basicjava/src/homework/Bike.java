package homework;

public class Bike extends Wheeler{
	public Bike(String carName, int velocity, int wheelNumber){
		super(velocity, carName, wheelNumber);
	}
	
	public void speedUp(int speed){
		velocity = velocity+speed;
		if(velocity>40){
			velocity=40;
			System.out.println(carName+"�� �ְ�ӵ��������� �ӵ��� "+velocity+"���� �����ϴ�.");
		}else{
			System.out.println(carName+"�� ���� �ӵ��� "+velocity+" �Դϴ�.");
		}
	}
	public void speedDown(int speed) {
		velocity = velocity-speed;
		if(velocity<10){
			velocity=10;
			System.out.println(carName+"�� �����ӵ��������� �ӵ��� "+velocity+"���� �ø��ϴ�.");
		}else{
			System.out.println(carName+"�� ���� �ӵ��� "+velocity+" �Դϴ�.");
		}
	}
}
