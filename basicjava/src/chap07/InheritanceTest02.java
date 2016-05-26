package chap07;
/*
 * 1. 부모클래스에 정의된 메소드를 하위클래스에서 호출할 수 있다.
 *    => 하위객체의 참조변수를 통해서도 호출이 가능하다.
 * 2. 부모클래스의 메소드와 동일한 메소드를 정의하면 상위클래스의 메소드가 아니라 하위클래스의 메소드가 우선으로 인식된다.
 *    => 상위클래스에 정의된 메소드와 동일하게 정의하는 것을 메소드 재정의(메소드 오버라이딩)라고한다.
 *    => 메소드 오버라이딩을 하려면 반드시 메소드 선언부가 부모의 메소드와 동일하게 정의 되어야 한다. 
 */
class Parent{
	public void display(){
		System.out.println("부모의 display");
	}
}
class Child extends Parent{
	public void test(){
		display();
	}
	
	public void display(){
		System.out.println("하위의 display");
	}
	
}
public class InheritanceTest02 {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.test();
		obj.display();

	}

}
