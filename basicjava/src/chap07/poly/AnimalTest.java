package chap07.poly;

public class AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);
		if(cheatableChicken instanceof Chicken){
			cheatableChicken.fly();
		}
		//���
		System.out.println("ȭ�� ���(AnimalTest ����");
		for(int i=1;i<=3;i++){
			System.out.println(i+"�ð� ��");
			dog.run(1);
			chicken.run(1);
			cheatableChicken.run(1);;
			System.out.println("���� �̵��Ÿ�="+dog.getDistance());
			System.out.println("���� �̵��Ÿ�="+chicken.getDistance());
			System.out.println("������ ���� �̵��Ÿ�="+cheatableChicken.getDistance());
		}
	}
}












