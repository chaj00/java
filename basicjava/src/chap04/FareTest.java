package chap04;

import java.util.Scanner;

public class FareTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----Menu------------");
		System.out.println("1.가정용 (liter당 50원)");
		System.out.println("2.상업용 (liter당 45원)");
		System.out.println("3.공업용 (liter당 30원)");
		System.out.println("--------------------");
		System.out.println("메뉴를선택하세요=>");
		System.out.println("--------------------");
		
		int menu = sc.nextInt();	
		if(menu != 1 && menu !=2 && menu !=3){
			System.out.println("잘못입력하였습니다.");
		}	
		System.out.println("사용량을 입력하세요=>");
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
		System.out.println("사용자 코드: "+menu);
		System.out.println("사용요금: "+cost);
		System.out.println("총수도요금: "+total);
		System.out.println("--------------------");

	}

}
