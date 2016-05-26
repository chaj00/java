package thread;

/*
 * ���ͷ�Ʈ�� �߻���Ű�� ���� ���¸� Ȯ���� �Ŀ� �۾��ϱ�
 * ���ͷ�Ʈ�� �߻��Ǹ� Exception�� �߻��ǹǷ� catch������ ó���� �� �ִ�.
 */
class StopThread02 extends Thread {
	private boolean state = false;

	public void run() {
		try {
			while (!Thread.currentThread().isInterrupted()) { // ���� ���ͷ�Ʈ �������� �Ǵ�
				System.out.println("���� ������ ����:������~~~~~");
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
				e.printStackTrace();
		}finally{
			System.out.println("���� ������ ����:����~~~");
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

		// ���ͷ�Ʈ �߻�
		t.interrupt();
	}

}
