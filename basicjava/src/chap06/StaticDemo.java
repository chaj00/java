package chap06;

public class StaticDemo {
	static int num;
	public StaticDemo(){
		num++;
	}
	public void display(){
		System.out.println(num);
	}
	public static void test(){
		System.out.println("test");
	}
	public static void show(){
		StaticDemo obj = new StaticDemo();
		obj.change();
		System.out.println("show");
	}
	public void change(){
		System.out.println("change");
	}
}
