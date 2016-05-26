package chap04;

import java.util.Scanner;

public class MiniCal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op = 0;
		int num1 = 0;
		int num2 = 0;
		int result = 0;
				
		System.out.println("*******미니계산기******");
		System.out.println("1.더하기");
		System.out.println("2.곱하기");
		System.out.println("3.빼기");
		System.out.println("4.나누기");
		System.out.print("연산자를 선택하세요.");
		op = scan.nextInt();
		
		System.out.print("숫자를 입력하세요 ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		switch (op){
		case 1:
			result = num1+num2;
			break;
		case 2:
			result = num1*num2;
			break;
		case 3:
			result = num1-num2;
			break;
		case 4:
			result = num1/num2;
			break;
		default :
			break;
		}
		System.out.print("계산결과=>"+result);	
	}

}
