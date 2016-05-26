package thread;

class AlphaThread extends Thread {
	char c='A';
	public void run(){
		for (int i = 1; i <= 26; i++) {
			System.out.print(c+" ");
			c++;
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
class DigitThread extends Thread {
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
public class ThreadTest02 {
	public static void main(String[] args) {
		AlphaThread al = new AlphaThread();
		DigitThread di = new DigitThread();
		al.start();
		di.start();
		for(int i=1;i<=20;i++){
			System.out.print("$ ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
