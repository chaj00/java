package chap08;

import java.io.IOException;

//예외 발생하는 곳에서 무조건 예외를 처리하지 않고 호출하는 곳에서 예외를 처리하도록 예외를 전달
public class ThrowsTest02 {
	//a()가 예외발생 가능성이 있는 코드를 가지고 있는 메소드로 정의
	//==> 예외가 발생하면 무조건  a()에서 처리
	public int a(int num1, int num2) throws ArithmeticException{
		System.out.println("********a()호출********");
		int result=0;
		result =num1/num2;
		return result;
	}
	//a()를 호출하는 b()를 정의
	public void b(int num1,int num2){
		System.out.println("********b()호출********");
		int result = 0;
		try{
			result = a(num1,num2);
		}catch(ArithmeticException e){
			result = 0;
		}
		System.out.println("a()호출결과===>"+result);
	}
	//a()를 호출하는 c()를 정의
		public void c(int num1,int num2){
			System.out.println("********c()호출********");
			int result =0;
			try{
				result = a(num1,num2);
			}catch(ArithmeticException e){
				result = 100;
			}
			System.out.println("a()호출결과===>"+result);
		}
	public static void main(String[] args) {
		//예외가 발생하는 메소드인 a에서 처리하지 않고 호출하는 b()와 c()에서 예외처리하고 있기때문에 각각 다른 결과를 얻을수 있다.
		ThrowsTest02 obj = new ThrowsTest02();
		obj.b(1000,0);
		obj.c(10, 0);
		
		

	}

}
