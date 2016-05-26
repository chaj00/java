package thread;

class AlphaRunnalbe implements Runnable {
	
	public void run(){
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i+" ");
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
class DigitRunnalbe implements Runnable {
	public void run(){
		for (int i = 1; i <= 100; i++) {
			System.out.print(i+" ");
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
public class RunnableTest02 {
	public static void main(String[] args) {
		System.out.println("*************main쓰레드-시작*************");
		Thread t1 = new Thread(new AlphaRunnalbe());
		Thread t2 = new Thread(new DigitRunnalbe());
		t1.start();
		t2.start();
		System.out.println("*************main쓰레드-종료*************");
	}
}
