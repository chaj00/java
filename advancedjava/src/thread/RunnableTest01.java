package thread;
/*
 * �̹� �ٸ�  Ŭ������ ����ϰ� �־ ThreadŬ������ ��� �� �� ���� ���
 * 1. Runnable�� ����Ѵ�.
 * 2. run�޼ҵ带 �������̵��ؼ� ������� �����ϰ� ���� ����� �����Ѵ�.
 * 3. Runnable��ü�� �̿��ؼ� Thread��ü�� �����Ѵ�.
 * 	  => �ۼ��� Runnable�� ����ϴ� ��ü�� new�����ڷ� ������ �� ThreadŬ������ ������ �� 
 * 		 Runnable��ü�� �Ű������� �޴� �����ڸ� ȣ���Ͽ� ��ü�� �����Ѵ�.
 * 4. Thread��ü�� start()�� ȣ���Ѵ�.
 */
class RunnableDemo01 implements Runnable{
	String str;
	public RunnableDemo01(String str) {
		
		this.str = str;
	}
	public void run(){
		for (int i = 1; i <= 50; i++) {
			System.out.print(str);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i%10==0){
				System.out.println();
			}
		}
	}
}

public class RunnableTest01 {

	public static void main(String[] args) {
		System.out.println("*************main������-����*************");
		RunnableDemo01 obj = new RunnableDemo01("��");
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(new RunnableDemo01("��"));
		t1.start();
		t2.start();
		System.out.println("*************main������-����*************");

	}

}