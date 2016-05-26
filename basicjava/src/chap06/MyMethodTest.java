package chap06;
//선언된 메소드를 사용하는 클래스
public class MyMethodTest {
	public static void main(String[] args) {
		MyMethod m = new MyMethod(); 
		//1.매개변수가 없고 리턴타입이 없는 메소드의 호출
		//  => (),리턴값이 없으므로 변수를 선언해서 할당받지 않았다.
		m.display();
		m.display();
		
		//2. 매개변수가 있고 리턴 타입이 없는 메소드
		m.display("★");
		m.display("※");
		
		//3. 매개변수가 두개 있고 리턴 타입이 없는 메소드
		m.display("★",20);
		m.display("※",15);
		
		//4. 매개변수 있고 리턴타입이 있는 메소드
		//===> 리턴타입이 있는 메소드의 호출인 경우 반드시 리턴타입과 동일한 타입의 변수를 선언해서
		//     리턴값을 저장
		int val = m.add(100, 200);
		System.out.println("add메소드 호출결과=>"+val);
		
		//메소드에 리턴값이 존재하는 경우 또다른 메소드의 매개변수로 바로 전달받도록 호출할 수 있다.
		System.out.println(m.add(200, 300));
		
	}
}
