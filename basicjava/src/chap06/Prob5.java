package chap06;

public class Prob5 {
	
	public static void main(String[] args){
		
		Rectangle1 rectangle01 = new Rectangle1(10, 20, "청색");
		rectangle01.calculateArea();
		System.out.println("1 : "+rectangle01.getColor()+" 직사각형 면적 : "+rectangle01.getArea());
		 
		Rectangle1 rectangle02 = new Rectangle1(20, 20);
		rectangle02.calculateArea();
		System.out.println("2 : "+rectangle02.getColor()+" 직사각형 면적 : "+rectangle02.getArea());
		 
		Rectangle1 rectangle03 = new Rectangle1();
		rectangle03.setHeight(10);
		rectangle03.setWidth(10);
		rectangle03.setColor("녹색");
		rectangle03.calculateArea();
		System.out.println("3 : "+rectangle03.getColor()+" 직사각형 면적 : "+rectangle03.getArea());
	
	}
	
}
