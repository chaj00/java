package chap07.poly;

public class MMSSender extends Sender {
	int length;
	public MMSSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void send() {
		System.out.println("MMS·Î Àü¼Û");

	}

}
