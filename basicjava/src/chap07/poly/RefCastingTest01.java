package chap07.poly;
class Super{
	String name = "�嵿��";
	public void display(){
		System.out.println("Super�� display");
	}
}

class Sub extends Super{
	String name = "�̹�ȣ";
	int data =1000;
	public void display(){
		System.out.println("Sub�� display");
	}
	public void test(){
		System.out.println("test");
	}
}
class Sub2 extends Super{
	
}

public class RefCastingTest01 {
	public static void main(String[] args) {
		System.out.println("SuperŸ���� ���������� Super��ü�� ����");
		Super obj1 = new Super();
		System.out.println(obj1.name);
		obj1.display();
		System.out.println();
		
		System.out.println("SubŸ���� ���������� Sub��ü�� ����");
		Sub obj2 = new Sub();
		System.out.println(obj2.name);
		obj2.display();
		System.out.println();
		//�������� �ڵ�����ȯ
		//=> �������� ����ȯ�� ��Ӱ��迡 �ִ� Ŭ���������� �����ϴ�.
		//   �θ�Ÿ�� ���� = new �ڽİ�ü()�� �ڵ�����ȯ�� �̷������.
		//   ���� �۾� ���� ������ ������ Ÿ���̹Ƿ� ���������� Ÿ�Կ� �ش��ϴ� ����� ������ �����ϴ�.
		System.out.println("SuperŸ���� ���������� Sub��ü�� ����");
		Super obj3 = new Sub();//obj3�� SuperŸ���̹Ƿ� Super�� name�� ȣ��
		System.out.println(obj3.name);
		obj3.display();//��, �������̵��� �޼ҵ��� ��쿡�� �������̵��� �޼ҵ尡 �켱���� �ν�
		((Sub)obj3).test();//test()�� SubŬ������ ����̹Ƿ� ������ �Ұ����ϳ�
						   //obj3�̶�� ������ ���� �����ϴ� ��ü�� Sub��ü�̹Ƿ� ����ȯ�� ��������� �ϸ� ������ �����ϴ�.
		System.out.println();
		
		System.out.println("SubŸ���� ���������� Super��ü�� ����");
		
		

	}

}
