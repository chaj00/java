package thread.sync;

public class AccountSumThread extends Thread {
	SharedObj obj;
	
	public AccountSumThread(SharedObj obj){
		super();
		this.obj = obj;
	}
	public void run(){
		//acc1과 acc2의 잔액을 더해서 출력하는 기능
		for(int i=1; i<=5; i++){
			synchronized(obj){ //synchronized 블럭을 이용하는 경우 ()의 객체는 굑유객체를 명시
				long total = obj.acc1.getBalance() + obj.acc2.getBalance();
				System.out.println("총 합계=>"+total);
			}
		}
	}

}
