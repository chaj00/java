package chap06;

import java.util.Scanner;

public class GuGu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("구구단 입력 : ");
		int num = sc.nextInt();

		Calc c = new Calc();
		c.showGuGu(num);
		
	}

}
