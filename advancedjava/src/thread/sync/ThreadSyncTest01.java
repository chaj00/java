package thread.sync;

public class ThreadSyncTest01 {

	public static void main(String[] args) {
		Toilet obj = new Toilet();
		
		//������ü�� ����� ������ ��ü�� ����
		Person p1 = new Person("�嵿��",obj);
		Person p2 = new Person("����",obj);
		Person p3 = new Person("������",obj);
		Person p4 = new Person("�ڹμ�",obj);
		Person p5 = new Person("������",obj);
		Person p6 = new Person("������",obj);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		
	}

}
