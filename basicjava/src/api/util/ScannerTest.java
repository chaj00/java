package api.util;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("�ܾ �Է��ϼ���..");
		String result1 = key.next();
		System.out.println(result1);
		
		System.out.print("���ڸ� �Է��ϼ���..");
		int result2 = key.nextInt();
		System.out.println("���=> "+result2);
		

	}

}
