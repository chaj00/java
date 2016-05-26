package chap08;

import java.io.IOException;

//���� �߻��ϴ� ������ ������ ���ܸ� ó������ �ʰ� ȣ���ϴ� ������ ���ܸ� ó���ϵ��� ���ܸ� ����
public class ThrowsTest02 {
	//a()�� ���ܹ߻� ���ɼ��� �ִ� �ڵ带 ������ �ִ� �޼ҵ�� ����
	//==> ���ܰ� �߻��ϸ� ������  a()���� ó��
	public int a(int num1, int num2) throws ArithmeticException{
		System.out.println("********a()ȣ��********");
		int result=0;
		result =num1/num2;
		return result;
	}
	//a()�� ȣ���ϴ� b()�� ����
	public void b(int num1,int num2){
		System.out.println("********b()ȣ��********");
		int result = 0;
		try{
			result = a(num1,num2);
		}catch(ArithmeticException e){
			result = 0;
		}
		System.out.println("a()ȣ����===>"+result);
	}
	//a()�� ȣ���ϴ� c()�� ����
		public void c(int num1,int num2){
			System.out.println("********c()ȣ��********");
			int result =0;
			try{
				result = a(num1,num2);
			}catch(ArithmeticException e){
				result = 100;
			}
			System.out.println("a()ȣ����===>"+result);
		}
	public static void main(String[] args) {
		//���ܰ� �߻��ϴ� �޼ҵ��� a���� ó������ �ʰ� ȣ���ϴ� b()�� c()���� ����ó���ϰ� �ֱ⶧���� ���� �ٸ� ����� ������ �ִ�.
		ThrowsTest02 obj = new ThrowsTest02();
		obj.b(1000,0);
		obj.c(10, 0);
		
		

	}

}
