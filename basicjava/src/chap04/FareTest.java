package chap04;

import java.util.Scanner;

public class FareTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Menu------------");
		System.out.println("1.������ (liter�� 50��)");
		System.out.println("2.����� (liter�� 45��)");
		System.out.println("3.������ (liter�� 30��)");
		System.out.println("--------------------");
		System.out.println("�޴��������ϼ���=>");
		System.out.println("--------------------");
		
		int menu = sc.nextInt();	
		if(menu != 1 && menu !=2 && menu !=3){
			System.out.println("�߸��Է��Ͽ����ϴ�.");
		}	
		System.out.println("��뷮�� �Է��ϼ���=>");
		int amount = sc.nextInt();	
		int cost=0;
		double tax =0;
		double total=0;
		
		switch (menu){
		case 1:
			cost = amount*50;
			break;
		case 2:
			cost = amount*45;
			break;
		case 3:
			cost = amount*30;
			break;
		default :
			break;		
		}
		tax =0.5*cost;
		total =cost + tax;
		System.out.println("--------------------");
		System.out.println("����� �ڵ�: "+menu);
		System.out.println("�����: "+cost);
		System.out.println("�Ѽ������: "+total);
		System.out.println("--------------------");

	}

}
