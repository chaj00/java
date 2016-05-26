package thread;
/*
 * 임의의 변수를 이용
 * 변수값에 따라서 작업을 다르게 처리 할 수 있도록 구현하는 방법
 * 보통 변수 타입이 boolean으로 지정
 */
class StopThread01 extends Thread{
	private boolean state = false;
	public void run(){
		while(!state){
			System.out.println("현재 쓰레드 상태:실행중~~~~~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("현재 쓰레드 상태:종료~~~");
	}
	//쓰레드를 제어할 수 있도록 정의한 변수의 값을 변경
	public void stopThread(){
		state = true;
	}
}

public class StopThreadTest01 {

	public static void main(String[] args) {
		StopThread01 t = new StopThread01();
		t.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		t.stopThread();

	}

}
