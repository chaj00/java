package chap08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest04 {

	public static void main(String[] args) {
		try{
			//���ܹ߻� ���ɼ��� �ִ� �ڵ�
			Scanner key = new Scanner(System.in);
			System.out.println("����");
			System.out.print("���ڸ� �Է��ϼ���:");
			int num1 = key.nextInt();
			System.out.print("���� ���� �Է��ϼ���:");
			int num2 = key.nextInt();
			System.out.println("���===>"+(num1/num2));
			System.out.println("����");
		}catch(ArithmeticException e){
			System.out.println("���� ���� 0�Է�������");
		}catch(InputMismatchException e){
			System.out.println("�Է� �� Ÿ�� Ȯ��");
		}catch(Exception e){
			//���ܰ� �߻��Ǹ� ó��
			System.out.println("��Ÿ���");
		}finally{
			System.out.println("finally");
		}

	}

}
