package chap07;
//��Ӱ��迡�� ����ʵ�
/*
 * 1. ��Ӱ��迡�� ����Ŭ������ ����� ����ʵ�� ����Ŭ�������� ������ �����ϴ�.
 * 2. ����Ŭ�������� ����� ������ ������ �̸��� ����ʵ尡 ����Ŭ������ ���ǵ� ���
 *    �θ��ʵ庸�� ����Ŭ������ ���ǵ� ����ʵ尡 �켱���� �νĵȴ�.
 * 3. �θ��� ����� �����ϰ� ���� ��� super�� �̿��Ͽ� �����Ѵ�.
 *    this => �ڱ��ڽ��� ��ü�� ��Ī
 *    super => �θ�ü
 * 4. ��, private ����� ������ü������ ������ �Ұ���
 * 
 *  
 */
class Super{
	int num =10;
	
}
class Sub extends Super{
	int num =100;
	
	public void display(){
		System.out.println("num=>"+num);
		System.out.println("�θ���num=>"+super.num);
	}
}

public class InheritanceTest01 {
	public static void main(String[] args) {
		Sub obj = new Sub();
		//System.out.println(obj.num);
		obj.display();

	}

}
