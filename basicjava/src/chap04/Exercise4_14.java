package chap04;

import java.util.Random;
import java.util.Scanner;

public class Exercise4_14 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int comnum = rand.nextInt(100)+1;
		int mynum =0;
		int count=0;
		
		do{
			System.out.print("1��100������ ���� �Է��ϼ��� :");
			mynum = sc.nextInt();
			count++;
			if(comnum==mynum){
				System.out.println("������ϴ�.");
				System.out.println("�õ�Ƚ���� "+count+"���Դϴ�.");
				break;
			}else if(comnum<mynum){
				System.out.println("�� ���� ���� �Է��ϼ���");
			}else if(comnum>mynum){
				System.out.println("�� ū ���� �Է��ϼ���");
			}
		}while(true);
	}
}