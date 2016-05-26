package homework;

public class CashPayment extends Payment {
	private String cashReceiptNumber;
	
	public CashPayment(){
	}
	public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber){
		super(shopName, productName, productPrice);
		this.cashReceiptNumber = cashReceiptNumber;
	}
	
	public String toString(){
		return "������ : "+shopName+"\n��ǰ�� : "+productName+"\n��ǰ����: "+productPrice +
														"\n���ݿ�������ȣ: "+ cashReceiptNumber ;
	}
	
	@Override
	public void pay() throws PayException {
		if(productPrice <=0){
			throw new PayException("������ �߸��Ǿ����ϴ�.");
		}
		System.out.println("������ ���������� ���ҵǾ����ϴ�.");
		System.out.println("[ ���� ���� ���� ]");
		
	}
	
	public String getCashReceiptNumber() {
		return cashReceiptNumber;
	}
	public void setCashReceiptNumber(String cashReceiptNumber) {
		this.cashReceiptNumber = cashReceiptNumber;
	}
}
