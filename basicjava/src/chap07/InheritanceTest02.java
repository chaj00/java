package chap07;
/*
 * 1. �θ�Ŭ������ ���ǵ� �޼ҵ带 ����Ŭ�������� ȣ���� �� �ִ�.
 *    => ������ü�� ���������� ���ؼ��� ȣ���� �����ϴ�.
 * 2. �θ�Ŭ������ �޼ҵ�� ������ �޼ҵ带 �����ϸ� ����Ŭ������ �޼ҵ尡 �ƴ϶� ����Ŭ������ �޼ҵ尡 �켱���� �νĵȴ�.
 *    => ����Ŭ������ ���ǵ� �޼ҵ�� �����ϰ� �����ϴ� ���� �޼ҵ� ������(�޼ҵ� �������̵�)����Ѵ�.
 *    => �޼ҵ� �������̵��� �Ϸ��� �ݵ�� �޼ҵ� ����ΰ� �θ��� �޼ҵ�� �����ϰ� ���� �Ǿ�� �Ѵ�. 
 */
class Parent{
	public void display(){
		System.out.println("�θ��� display");
	}
}
class Child extends Parent{
	public void test(){
		display();
	}
	
	public void display(){
		System.out.println("������ display");
	}
	
}
public class InheritanceTest02 {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.test();
		obj.display();

	}

}
