package chap04;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("*******미니계산기********");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		System.out.print("연산자를 선택하세요.");
		int opr = key.nextInt();
		
	
		//opr의 값에 따라 switch적용
		if(opr>=5){
			System.out.println("1부터 4까지 입력해...");
			System.exit(0);//시스템 정상종료
		}
		System.out.print("숫자를 입력하세요.");
		int num1 = key.nextInt();
		int num2 = key.nextInt();
		//계산결과를 지정할 변수를 선언
		int result=0;
		switch(opr){
			case 1://더하기연산
				result = num1+num2;
				break;
			case 2://곱하기연산
				result = num1 * num2;
				break;
			case 3://빼기연산
				result = num1-num2;
				break;
			case 4://나누기연산
				result = num1/num2;
				break;
			default:
				result = 0;
		}
		System.out.println("계산결과=>"+result);
	}

}







