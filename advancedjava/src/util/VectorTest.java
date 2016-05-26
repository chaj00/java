package util;

import gui.tool.Page1;

import java.util.Vector;

import oracle.net.aso.e;
//List자료구조 - 순서가 있는 데이터의 저장(중복이 가능)
public class VectorTest {
	public static void main(String[] args){
		//데이터를 담을수 있도록 벡터를 생성
		Vector<String> v = new Vector<String>();
		System.out.println("현재 벡터에 저장된 요소의 개수=>"+v.size());
		System.out.println("현재 벡터의 용량=>"+v.capacity());
		v.add("문자열");
		for(int i =1 ; i<=10 ;i++){
			v.add(i+"");
		}
		v.add("문자열");
		System.out.println("현재 벡터에 저장된 요소의 개수=>"+v.size());
		System.out.println("현재 벡터의 용량=>"+v.capacity());
		
		//벡터에 저장된 데이터 출력하기
		for(int i=0;i<v.size();i++){
			System.out.println((i+1)+"번째 요소==>"+v.get(i));
		}
		
	}

}
