package util;

import java.util.ArrayList;

public class ArrayListExam {
	public static void main(String[] args){
		int[] myarr = {1,2,30,50,40};
		ArrayList<Integer> list = arraycopy(myarr);
		//�޼ҵ� ȣ��� ���޹��� ArrayList�� ��Ҹ� ����ϼ���
		for(int i=0; i<list.size();i++){
			System.out.println((i+1)+"��° ���:"+list.get(i));
		}
	}
	public static ArrayList<Integer> arraycopy(int[] arr){
		//�迭�� ArraryList�� ��ȯ�Ͽ� �����ϴ� �޼ҵ带 �����ϼ���
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			list.add(arr[i]);
		}
		return list;
	}
}
