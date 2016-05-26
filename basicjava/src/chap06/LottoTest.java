package chap06;

import java.util.Scanner;

public class LottoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Lotto lo = new Lotto();
		
		System.out.println("********Lotto********");
		System.out.println("���Ӽ��� �����ϼ���.(�ִ�5����)");
		//�ζǱ���
		int num = sc.nextInt();		
		if(num<1 | num>5){
			System.out.println("�߸��Է��Ͽ����ϴ�.�����մϴ�.");
			return;
		}
		//�ڵ�, ����
		System.out.println("�ڵ���ȣ���� 1��, ������ȣ���� 2��");
		int sel = sc.nextInt();
		
		int[][] lotto = new int[num][6];
		switch(sel){
			case 1: //�ڵ�
				lotto = lo.autoselect(num);
				break;
			case 2: //����
				lotto = lo.manualselect(num);			
				break;
			default :
				System.out.println("�߸��Է��Ͽ����ϴ�.�����մϴ�.");
				return;
		}
		
		//���
		lo.lottoprint(sel,lotto);
		
		//��÷Ȯ��
		lo.wonlotto();

	}

}
