package chap06;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		
		Scanner key = new Scanner(System.in);
		System.out.println("*******�̴ϰ���********");
		System.out.println("1.���ϱ�");
		System.out.println("2.���ϱ�");
		System.out.println("3.����");
		System.out.println("4.������");
		System.out.print("�����ڸ� �����ϼ���.");
		int opr = key.nextInt();
		
		//opr�� ���� ���� switch����
		if(opr>=5){
			System.out.println("1���� 4���� �Է���...");
			System.exit(0);//�ý��� ��������
		}
		System.out.print("���ڸ� �Է��ϼ���.");
		int num1 = key.nextInt();
		int num2 = key.nextInt();
		key.close();
		
		//������� ������ ������ ����
		int result = c.calc(opr, num1, num2);
	
		System.out.println("�����=>"+result);
	}
}







