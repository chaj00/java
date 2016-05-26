package homework;

public class CardPayment extends Payment {
	private String cardNumber;
	private String cardPassword;
	private int monthlyInstallment;
	
	public CardPayment(){
	}
	public CardPayment(String shopName, String productName, long productPrice, 
						String cardNumber, String cardPassword, int monthlyInstallment){
	
		super(shopName, productName, productPrice);
		this.cardNumber =cardNumber;
		this.cardPassword =cardPassword;
		this.monthlyInstallment = monthlyInstallment;
	}
	
	public String toString(){
		return "상점명 : "+shopName+"\n상품명 : "+productName+"\n상품가격: "+productPrice +
								"\n신용카드번호 : "+cardNumber+"\n할부개원 :"+monthlyInstallment;
	}
	
	@Override
	public void pay() throws PayException{
		if(productPrice <=0 | monthlyInstallment<0){
			throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
		}
		System.out.println("신용카드가 정상적으로 지불되었습니다.");
		System.out.println("[ 신용카드 결제 정보 ]");
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardPassword() {
		return cardPassword;
	}
	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}
	public int getMonthlyInstallment() {
		return monthlyInstallment;
	}
	public void setMonthlyInstallment(int monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}
}
