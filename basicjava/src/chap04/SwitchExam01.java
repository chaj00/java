package chap04;

import java.util.Scanner;

public class SwitchExam01{
	public static void main(String[] args){
		int ssn= 3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~4의 숫자를 입력하세요..");
		int input = sc.nextInt();
		
		switch(input){
		case 1:
		case 3:
			System.out.println("남자");
			break;
			
		case 2:
		case 4:
			System.out.println("여자");
			break;
		default :
			break;
		}
	}
}