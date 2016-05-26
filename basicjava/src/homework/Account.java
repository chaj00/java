package homework;

public class Account {
	private String accNo;
	private int balance;
	
	public Account(){
	}
	public Account(String accNo){
		this.accNo =accNo;
		System.out.println(accNo+" ���°� �����Ǿ����ϴ�.");
	}
	
	public void save(int amount){
		this.balance = this.balance + amount; 
		System.out.println(accNo+" ���¿�"+amount+"������ �Ա޵Ǿ����ϴ�.");
	}
	public void deposit(int amount){
		this.balance = this.balance - amount;
		System.out.println(accNo+" ���¿�"+amount+"������ ��޵Ǿ����ϴ�.");
	}
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo+" ���°� �����Ǿ����ϴ�.");
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
