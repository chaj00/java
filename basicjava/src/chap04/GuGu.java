package chap04;

import java.util.Scanner;

public class GuGu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 입력 : ");
		int num = sc.nextInt();

		for(int i=1; i<=9;i++){
			System.out.println(num+"x"+i+"="+num*i );
		}
	}

}
