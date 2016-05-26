package thread.sync;

public class AccountSumThread extends Thread {
	SharedObj obj;
	
	public AccountSumThread(SharedObj obj){
		super();
		this.obj = obj;
	}
	public void run(){
		//acc1�� acc2�� �ܾ��� ���ؼ� ����ϴ� ���
		for(int i=1; i<=5; i++){
			synchronized(obj){ //synchronized ���� �̿��ϴ� ��� ()�� ��ü�� �u����ü�� ���
				long total = obj.acc1.getBalance() + obj.acc2.getBalance();
				System.out.println("�� �հ�=>"+total);
			}
		}
	}

}
