package chap04;

import java.util.Scanner;

public class MiniCal {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op = 0;
		int num1 = 0;
		int num2 = 0;
		int result = 0;
				
		System.out.println("*******�̴ϰ���******");
		System.out.println("1.���ϱ�");
		System.out.println("2.���ϱ�");
		System.out.println("3.����");
		System.out.println("4.������");
		System.out.print("�����ڸ� �����ϼ���.");
		op = scan.nextInt();
		
		System.out.print("���ڸ� �Է��ϼ��� ");
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
		System.out.print("�����=>"+result);	
	}

}
