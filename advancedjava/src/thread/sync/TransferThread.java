package thread.sync;

public class TransferThread extends Thread {
	SharedObj obj;
	
	public TransferThread(SharedObj obj){
		super();
		this.obj = obj;
	}
	public void run(){
		//acc1에서 100만원을 빼서 acc2로 이체하는 작업30
		for(int i =1; i<30; i++){
			synchronized (obj){
				obj.acc1.withdraw(1000000);
				System.out.println("100만원을 출금했습니다.");
				obj.acc2.deposit(1000000);
				System.out.println("100만원을 입금했습니다.");
			}
		}
	}
}
