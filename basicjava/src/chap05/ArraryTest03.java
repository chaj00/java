package chap05;

public class ArraryTest03 {
	public static void main(String[] args) {
		//선언,생성,초기화 한꺼번에
		
		int[] myarr = {10,20,30,40,50};
		int[] myarr2 = new int[]{100,90,80,70,55};; //자바답게
		String[] myarr3 = {new String("Java"), new String("oracle")};
		String[] myarr4 = {"Java", "oracle", "spring"};
		
		for (int i = 0; i < myarr4.length; i++) {
			System.out.println(myarr4[i]);
			
		}	
		
	}

}
