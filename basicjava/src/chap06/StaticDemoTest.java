package chap06;

public class StaticDemoTest {

	public static void main(String[] args) {
		//stat
		StaticDemo obj1 = new StaticDemo();
		obj1.display();
		System.out.println(StaticDemo.num);
		
		StaticDemo obj2 = new StaticDemo();
		obj1.display();
		System.out.println(StaticDemo.num);
		
		StaticDemo obj3 = new StaticDemo();
		obj1.display();
		System.out.println(StaticDemo.num);

	}

}
