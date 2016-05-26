package chap07.poly;
/*
 * abstract클래스는 추상 클래스=> 추상메소드를 포함하는 클래스
 *   => 일반메소드, 추상메소드 모두 정의가 가능
 *   => 추상메소드가 정의되어 있는 클래스는 new에서 생성할 수 웞는 클래스
 *      반드시 abstract키워드를 class선언문에도 추가해야한다.
 *   =>abstract클래스를 상속받는 하위클래스에서는 반드시 abstract메소드를 재정의 하도록 문법적으로 알려주고있다.
 *   [추상메소드]
 *   메소드 body가 없는 메소드
 */
abstract class Parent{
	public void tet(){
		System.out.println("test");
	}
	public abstract void display();
}
class child extends Parent{

	@Override
	public void display() {
	}
	
}
public class AbstractTest01{
	public static void main(String[] args){
		
	}
}