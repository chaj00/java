package util;

import gui.tool.Page1;

import java.util.Vector;

import oracle.net.aso.e;
//List�ڷᱸ�� - ������ �ִ� �������� ����(�ߺ��� ����)
public class VectorTest {
	public static void main(String[] args){
		//�����͸� ������ �ֵ��� ���͸� ����
		Vector<String> v = new Vector<String>();
		System.out.println("���� ���Ϳ� ����� ����� ����=>"+v.size());
		System.out.println("���� ������ �뷮=>"+v.capacity());
		v.add("���ڿ�");
		for(int i =1 ; i<=10 ;i++){
			v.add(i+"");
		}
		v.add("���ڿ�");
		System.out.println("���� ���Ϳ� ����� ����� ����=>"+v.size());
		System.out.println("���� ������ �뷮=>"+v.capacity());
		
		//���Ϳ� ����� ������ ����ϱ�
		for(int i=0;i<v.size();i++){
			System.out.println((i+1)+"��° ���==>"+v.get(i));
		}
		
	}

}
