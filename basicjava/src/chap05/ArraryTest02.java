package chap05;

public class ArraryTest02 {
	public static void main(String[] args) {
		//1.����� ������ �Ѳ�����
		int[] myarr = new int[5];
		//length�� �迭�� ��������� ����� ������ �����ϰ� �ִ� ����
		System.out.println(myarr.length);
		//System.out.println(myarr[5]);
		
		String[] myarr2 = new String[3];
		System.out.println(myarr2[0]);
		myarr2[0] = new String("Java");
		myarr2[1] = new String("oracle");
		myarr2[2] = new String("hadoop");

	}

}
