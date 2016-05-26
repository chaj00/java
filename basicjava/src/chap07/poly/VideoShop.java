package chap07.poly;

public class VideoShop {
	public static void main(String[] args) {
		Content[] content = new Content[3];
		content[0] = new Video("ÀÌÅ¬¸³½º","new");
		content[1] = new Video("Ã¼Æ÷¿Õ","comic");
		content[2] = new Video("»Ç·Õ»Ç·Õ»Ç·Î·Î2","child");
		for (int i = 0; i < content.length; i++) {
			content[i].totalPrice();
			content[i].show();
		}
		
	}
}
