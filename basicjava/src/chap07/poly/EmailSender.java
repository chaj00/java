package chap07.poly;

public class EmailSender extends Sender {
	int length;
	public EmailSender(String name,int length){
		super(name);
		this.length = length;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public void send(){
		System.out.println("Email·Î Àü¼Û");
	}
	
}

