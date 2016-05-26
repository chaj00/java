package thread;

/*
 * 인터럽트를 발생시키고 현재 상태를 확인한 후에 작업하기
 * 인터럽트ㅏ 발생되면 Exception이 발생되므로 catch절에서 처리할 수 있다.
 */
class StopThread02 extends Thread {
	private boolean state = false;

	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) { // 현재 인터럽트 상태인지 판단
				System.out.println("현재 쓰레드 상태:실행중~~~~~");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		}finally{
			System.out.println("현재 쓰레드 상태:종료~~~");
		}
		
	}

}

public class StopThreadTest02 {

	public static void main(String[] args) {
		StopThread02 t = new StopThread02();
		t.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// 인터럽트 발생
		t.interrupt();
	}

}
