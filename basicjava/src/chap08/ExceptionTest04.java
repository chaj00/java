package chap08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest04 {

	public static void main(String[] args) {
		try{
			//예외발생 가능성이 있는 코드
			Scanner key = new Scanner(System.in);
			System.out.println("시작");
			System.out.print("숫자를 입력하세요:");
			int num1 = key.nextInt();
			System.out.print("나눌 수를 입력하세요:");
			int num2 = key.nextInt();
			System.out.println("결과===>"+(num1/num2));
			System.out.println("종료");
		}catch(ArithmeticException e){
			System.out.println("나눌 수로 0입력하지마");
		}catch(InputMismatchException e){
			System.out.println("입력 값 타입 확인");
		}catch(Exception e){
			//예외가 발생되면 처리
			System.out.println("기타등등");
		}finally{
			System.out.println("finally");
		}

	}

}
