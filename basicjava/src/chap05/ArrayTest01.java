package chap05;

public class ArrayTest01 {

	public static void main(String[] args) {
		//1.�迭�� ����
		int[] myarr;
		//2.�迭�� ����
		myarr = new int[5];
		System.out.println("arrarr�迭�� 2��° ����� �� :"+myarr[1]);
		
		//3.�迭�� �ʱ�ȭ - 4��° ��ҿ� 100�� �Ҵ�
		myarr[3] = 100;
		
		//4. �迭�� ��� ��Ҹ� ���- for��
		for (int i = 0; i < 5; i++) {
			System.out.println(i+"��°���=>"+myarr[i]);
			
		}
		
		System.out.println(myarr);

	}

}
