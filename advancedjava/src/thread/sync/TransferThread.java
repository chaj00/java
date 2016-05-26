package thread.sync;

public class TransferThread extends Thread {
	SharedObj obj;
	
	public TransferThread(SharedObj obj){
		super();
		this.obj = obj;
	}
	public void run(){
		//acc1���� 100������ ���� acc2�� ��ü�ϴ� �۾�30
		for(int i =1; i<30; i++){
			synchronized (obj){
				obj.acc1.withdraw(1000000);
				System.out.println("100������ ����߽��ϴ�.");
				obj.acc2.deposit(1000000);
				System.out.println("100������ �Ա��߽��ϴ�.");
			}
		}
	}
}
