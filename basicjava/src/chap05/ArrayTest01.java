package chap05;

public class ArrayTest01 {

	public static void main(String[] args) {
		//1.배열의 선언
		int[] myarr;
		//2.배열의 생성
		myarr = new int[5];
		System.out.println("arrarr배열의 2번째 요소의 값 :"+myarr[1]);
		
		//3.배열의 초기화 - 4번째 요소에 100을 할당
		myarr[3] = 100;
		
		//4. 배열의 모든 요소를 출력- for문
		for (int i = 0; i < 5; i++) {
			System.out.println(i+"번째요소=>"+myarr[i]);
			
		}
		
		System.out.println(myarr);

	}

}
