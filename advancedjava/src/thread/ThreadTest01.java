package thread;
/*
 * 1. ������ ���α׷����� �����ϰ� ���� Ŭ������ �ۼ��� �� ThreadŬ������ ����Ѵ�.
 * 2. ������� �����ϰ� ���� ������ run�޼ҵ带 �������̵��Ͽ� �����Ѵ�.
 * 3. Thread��ü�� ���� �ִ� start()�� ȣ���Ѵ�.
 * 	  =>start()
 */
class ThreadDemo01 extends Thread{
	String str;
	public ThreadDemo01(String str, String name) {
		super(name);
		this.str = str;
	}
	public void run(){
		for (int i = 1; i <= 50; i++) {
			System.out.print(str+"("+getName()+")");
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

public class ThreadTest01 {

	public static void main(String[] args) {
		System.out.println("*************main ������ ����***********");
		ThreadDemo01 t1 = new ThreadDemo01("��","t1");
		ThreadDemo01 t2 = new ThreadDemo01("��","t2");
		//t1.run();  �ܼ� �޼ҵ� call
		t1.start();
		t2.start();
		for(int i=1;i<=10;i++){
			System.out.print("$");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("*************main ������ ����***********");
		

	}

}
