package thread.sync;

public class ThreadSyncTest02 {

	public static void main(String[] args) {
		SharedObj obj = new SharedObj();
		obj.acc1 = new Account("111-222-333", 50000000,"�嵿��");
		obj.acc2 = new Account("111-222-333", 10000000,"�輭��");
		
		//���������
		new AccountSumThread(obj).start();
		new TransferThread(obj).start();
	}

}
