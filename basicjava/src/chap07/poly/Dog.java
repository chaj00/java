package chap07.poly;

public class Dog extends Animal {
	public Dog(){
	}
	public Dog(int speed){
		super(speed);
	}
	
	@Override
	public void run(int hours) {
		setDistance(getDistance()+getSpeed()*hours*0.5);
	}
}
