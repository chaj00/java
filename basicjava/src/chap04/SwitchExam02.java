package chap04;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		//int jumsu = 100;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("0~100 점수를 입력하세요..");
		int input = sc.nextInt();
		
		switch (input/10){ 
		case 10:
			if(input%10 !=0){
				System.out.println("잘못 입력 하였습니다.");
				break;
			}
		case 9:
			System.out.println("점수 : A");
			break;
		case 8:
			System.out.println("점수 : B");
			break;
		case 7:
			System.out.println("점수 : C");
			break;
		case 6:
			System.out.println("점수 : D");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("점수 : F");
			break;
		default :
			System.out.println("잘못 입력 하였습니다.");
			break;
		
		}

	}

}
