package chap04;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
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
		//������� ������ ������ ����
		int result=0;
		switch(opr){
			case 1://���ϱ⿬��
				result = num1+num2;
				break;
			case 2://���ϱ⿬��
				result = num1 * num2;
				break;
			case 3://���⿬��
				result = num1-num2;
				break;
			case 4://�����⿬��
				result = num1/num2;
				break;
			default:
				result = 0;
		}
		System.out.println("�����=>"+result);
	}

}







