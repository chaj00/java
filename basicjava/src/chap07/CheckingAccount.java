package chap07;

public class CheckingAccount extends Account {
	private String cardNo;
	
	public CheckingAccount(){
	}
	public CheckingAccount(String accId, String ownerName, long balance, String cardNo){
		super(accId, balance, ownerName);
		this.cardNo = cardNo;
	}
	
	public void pay(String cardNo,long amount){
		if(this.cardNo.equals(cardNo) & getBalance()>=amount){
			withdraw(amount);
		} else{
			System.out.println("지불이 불가능합니다.");
		}
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
}
