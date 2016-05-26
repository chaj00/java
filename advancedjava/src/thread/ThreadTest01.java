package thread;
/*
 * 1. 쓰레드 프로그래밍을 구현하고 싶은 클래스를 작성할 때 Thread클래스를 상속한다.
 * 2. 쓰레드로 실행하고 싶은 내용을 run메소드를 오버라이딩하여 구현한다.
 * 3. Thread객체가 갖고 있는 start()를 호출한다.
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
		System.out.println("*************main 스레드 시작***********");
		ThreadDemo01 t1 = new ThreadDemo01("★","t1");
		ThreadDemo01 t2 = new ThreadDemo01("■","t2");
		//t1.run();  단순 메소드 call
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
		
		System.out.println("*************main 스레드 종료***********");
		

	}

}
