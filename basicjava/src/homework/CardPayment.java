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
		return "������ : "+shopName+"\n��ǰ�� : "+productName+"\n��ǰ����: "+productPrice +
								"\n�ſ�ī���ȣ : "+cardNumber+"\n�Һΰ��� :"+monthlyInstallment;
	}
	
	@Override
	public void pay() throws PayException{
		if(productPrice <=0 | monthlyInstallment<0){
			throw new PayException("�����̳� �Һΰ������� �߸��Ǿ����ϴ�.");
		}
		System.out.println("�ſ�ī�尡 ���������� ���ҵǾ����ϴ�.");
		System.out.println("[ �ſ�ī�� ���� ���� ]");
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
