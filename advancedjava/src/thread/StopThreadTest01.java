package thread;
/*
 * ������ ������ �̿�
 * �������� ���� �۾��� �ٸ��� ó�� �� �� �ֵ��� �����ϴ� ���
 * ���� ���� Ÿ���� boolean���� ����
 */
class StopThread01 extends Thread{
	private boolean state = false;
	public void run(){
		while(!state){
			System.out.println("���� ������ ����:������~~~~~");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("���� ������ ����:����~~~");
	}
	//�����带 ������ �� �ֵ��� ������ ������ ���� ����
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
