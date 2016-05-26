package thread;
/*
 * 이미 다른  클래스를 상속하고 있어서 Thread클래스를 상속 할 수 없는 경우
 * 1. Runnable을 상속한다.
 * 2. run메소드를 오버라이딩해서 쓰레드로 실행하고 싶은 기능을 구현한다.
 * 3. Runnable객체를 이용해서 Thread개체를 생성한다.
 * 	  => 작성한 Runnable을 상속하는 객체를 new연산자로 생성한 후 Thread클래스의 생성자 중 
 * 		 Runnable객체를 매개변수로 받는 생성자를 호출하여 객체를 생성한다.
 * 4. Thread객체의 start()를 호출한다.
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
		System.out.println("*************main쓰레드-시작*************");
		RunnableDemo01 obj = new RunnableDemo01("★");
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(new RunnableDemo01("※"));
		t1.start();
		t2.start();
		System.out.println("*************main쓰레드-종료*************");

	}

}
