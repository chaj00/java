package chap04;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		//int jumsu = 100;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("0~100 ������ �Է��ϼ���..");
		int input = sc.nextInt();
		
		switch (input/10){ 
		case 10:
			if(input%10 !=0){
				System.out.println("�߸� �Է� �Ͽ����ϴ�.");
				break;
			}
		case 9:
			System.out.println("���� : A");
			break;
		case 8:
			System.out.println("���� : B");
			break;
		case 7:
			System.out.println("���� : C");
			break;
		case 6:
			System.out.println("���� : D");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("���� : F");
			break;
		default :
			System.out.println("�߸� �Է� �Ͽ����ϴ�.");
			break;
		
		}

	}

}
