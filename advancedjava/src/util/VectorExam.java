package util;

import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		//99,88,77,100���� Vector�� �����ϰ� ������ ����� ����� �� �ֵ��� ����
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(99);
		v.add(88);
		v.add(77);
		v.add(100);
		int total=0;
		
		for(int i=0; i<v.size();i++){
			total = total + v.get(i);
		}
		int avg=total/v.size();
		
		System.out.println("����:"+total+"\t���:"+avg);
	}
}
