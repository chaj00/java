package homework;

public class Truck extends Wheeler{
	public Truck(String carName, int velocity, int wheelNumber){
		super(velocity, carName, wheelNumber);
	}
	
	public void speedUp(int speed){
		velocity = velocity+speed*5;
		if(velocity>100){
			velocity=100;
			System.out.println(carName+"의 최고속도위반으로 속도를 "+velocity+"으로 내립니다.");
		}else{
			System.out.println(carName+"의 현재 속도는 "+velocity+" 입니다.");
		}
	}
	public void speedDown(int speed) {
		velocity = velocity-speed*5;
		if(velocity<50){
			velocity=50;
			System.out.println(carName+"의 최저속도위반으로 속도를 "+velocity+"으로 올립니다.");
		}else{
			System.out.println(carName+"의 현재 속도는 "+velocity+" 입니다.");
		}
	}
}
