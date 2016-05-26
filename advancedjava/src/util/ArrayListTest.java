package util;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		//99,88,77,100점을 Vector에 저장하고 총점과 평균을 출력할 수 있도록 구현
		ArrayList<Integer> v = new ArrayList<Integer>();
		
		v.add(99);
		v.add(88);
		v.add(77);
		v.add(100);
		int total=0;
		
		for(int i=0; i<v.size();i++){
			total = total + v.get(i);
		}
		int avg=total/v.size();
		
		System.out.println("총점:"+total+"\t평균:"+avg);
	}
}
