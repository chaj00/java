package chap08;

import java.util.Scanner;

public class MyExceptionTest {
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int data = key.nextInt();
		if(data%2==1){
			try{
				//���ܰ� �ƴ� ��Ȳ���� ���ܸ� ���������� �߻���Ŵ
				//=> throw�� ���ؼ� ���ܹ߻� ���ɼ��� �ִ� �ڵ�� �νĵǹǷ� ����ó������ ���� ���־�� �Ѵ�.
				throw new MyException("Ȧ���Է�������~~~~");
			}catch(MyException e){
				e.printStackTrace();
			}
		}

	}

}
