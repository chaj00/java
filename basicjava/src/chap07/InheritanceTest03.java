package chap07;
//��Ӱ��迡�� ������
/*
 * 1. �ڹٿ����� ��ü�� ���� ������ ����� Object�� �����ϰ� �����Ϸ��� ���� �ڵ�����  ��ӹ��� �� �ֵ��� ����Ǿ� �ִ�.
 * 2. ���� ��� �����ڿ��� super()�� �����Ǿ� ������ �θ��� Ŭ������ ���� �޸𸮿� �Ҵ�ȴ�.
 */
class SuperA extends Object{
	String name;
	
	
	SuperA() {
		System.out.println("�θ��� ������");
	}

	SuperA(String name) {
		super();
		this.name = name;
		System.out.println("�θ��� ������");
	}
}
class SubA extends SuperA{
	String addr;
	int age;
	//�θ�Ŭ������ �����ڸ� ����ȣ���ؼ� ��ü�������� �ʴ´�. �θ� ���� �ִ� �ʵ嵵 ����Ŭ������ ���ؼ� ���É� �� �ֵ��� ����
	public SubA(String addr, int age,String name) {
		super(name);//��������� �θ��� �����ڸ� ȣ��
		this.addr = addr;
		this.age = age;
	}
	
	
}
public class InheritanceTest03 {

	public static void main(String[] args) {
		
		

	}

}
