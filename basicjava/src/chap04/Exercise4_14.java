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
			System.out.print("1과100사이의 값을 입력하세요 :");
			mynum = sc.nextInt();
			count++;
			if(comnum==mynum){
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 "+count+"번입니다.");
				break;
			}else if(comnum<mynum){
				System.out.println("더 작은 수를 입력하세요");
			}else if(comnum>mynum){
				System.out.println("더 큰 수를 입력하세요");
			}
		}while(true);
	}
}