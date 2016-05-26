package api.util;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("단어를 입력하세요..");
		String result1 = key.next();
		System.out.println(result1);
		
		System.out.print("숫자를 입력하세요..");
		int result2 = key.nextInt();
		System.out.println("결과=> "+result2);
		

	}

}
