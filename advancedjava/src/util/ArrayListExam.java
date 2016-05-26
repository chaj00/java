package util;

import java.util.ArrayList;

public class ArrayListExam {
	public static void main(String[] args){
		int[] myarr = {1,2,30,50,40};
		ArrayList<Integer> list = arraycopy(myarr);
		//메소드 호출로 전달받은 ArrayList의 요소를 출력하세요
		for(int i=0; i<list.size();i++){
			System.out.println((i+1)+"번째 요소:"+list.get(i));
		}
	}
	public static ArrayList<Integer> arraycopy(int[] arr){
		//배열을 ArraryList로 변환하여 리턴하는 메소드를 구현하세요
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			list.add(arr[i]);
		}
		return list;
	}
}
