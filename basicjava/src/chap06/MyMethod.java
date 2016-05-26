package chap06;
//여러 유형의 메소드를 선언
public class MyMethod {
	//1. 매개변수가 없고 리턴 타입이 없는 메소드
	public void display(){
		for (int i = 1; i <= 10; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	//2. 매개변수가 있고 리턴 타입이 없는 메소드
	public void display(String str){
		for (int i = 1; i <= 10; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	//3. 매개변수가 두개 있고 리턴 타입이 없는 메소드
	public void display(String str, int num){
		for (int i = 1; i <= num; i++) {
			System.out.print(str);
		}
		System.out.println();
	}
	
	//4. 매개변수 있고 리턴타입이 있는 메소드
	//==> 매소드 선언시에 리턴타입이 있는 경우 반드시 동일한 타입의 변수를 선언해서
	//    return명령문을 이용하여 리턴하다.
	//    return 변수;
	public int add(int num1, int num2){
		int result=num1+num2;
		return result;
	}
}
