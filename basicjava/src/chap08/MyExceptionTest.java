package chap08;

import java.util.Scanner;

public class MyExceptionTest {
	public static void main(String[] args){
		Scanner key = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int data = key.nextInt();
		if(data%2==1){
			try{
				//예외가 아닌 상황에서 예외를 인위적으로 발생시킴
				//=> throw에 의해서 예외발생 가능성이 있는 코드로 인식되므로 예외처리까지 같이 해주어야 한다.
				throw new MyException("홀수입력하지마~~~~");
			}catch(MyException e){
				e.printStackTrace();
			}
		}

	}

}
