package chap04;

import java.util.Scanner;

public class SwitchExam01{
	public static void main(String[] args){
		int ssn= 3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~4�� ���ڸ� �Է��ϼ���..");
		int input = sc.nextInt();
		
		switch(input){
		case 1:
		case 3:
			System.out.println("����");
			break;
			
		case 2:
		case 4:
			System.out.println("����");
			break;
		default :
			break;
		}
	}
}