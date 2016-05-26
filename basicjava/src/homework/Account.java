package homework;

public class Account {
	private String accNo;
	private int balance;
	
	public Account(){
	}
	public Account(String accNo){
		this.accNo =accNo;
		System.out.println(accNo+" 계좌가 개설되었습니다.");
	}
	
	public void save(int amount){
		this.balance = this.balance + amount; 
		System.out.println(accNo+" 계좌에"+amount+"만원이 입급되었습니다.");
	}
	public void deposit(int amount){
		this.balance = this.balance - amount;
		System.out.println(accNo+" 계좌에"+amount+"만원이 출급되었습니다.");
	}
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
		System.out.println(accNo+" 계좌가 개설되었습니다.");
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
}
