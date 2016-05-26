package chap05;

public class ArraryTest02 {
	public static void main(String[] args) {
		//1.선언과 생성을 한꺼번에
		int[] myarr = new int[5];
		//length는 배열의 멤버변수로 요소의 개수를 저장하고 있는 변수
		System.out.println(myarr.length);
		//System.out.println(myarr[5]);
		
		String[] myarr2 = new String[3];
		System.out.println(myarr2[0]);
		myarr2[0] = new String("Java");
		myarr2[1] = new String("oracle");
		myarr2[2] = new String("hadoop");

	}

}
