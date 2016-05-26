package chap07;
//상속관계에서 생성자
/*
 * 1. 자바에서는 객체가 갖는 공통의 기능을 Object에 정의하고 컴파일러를 통해 자동으로  상속받을 수 있도록 적용되어 있다.
 * 2. 또한 모든 생성자에는 super()가 생략되어 있으며 부모의 클래스가 먼저 메모리에 할당된다.
 */
class SuperA extends Object{
	String name;
	
	
	SuperA() {
		System.out.println("부모의 생성자");
	}

	SuperA(String name) {
		super();
		this.name = name;
		System.out.println("부모의 생성자");
	}
}
class SubA extends SuperA{
	String addr;
	int age;
	//부모클래스의 생성자를 직접호출해서 객체생성하지 않는다. 부모가 갖고 있는 필드도 하위클래스를 통해서 셋팅됭 수 있도록 구현
	public SubA(String addr, int age,String name) {
		super(name);//명시적으로 부모의 생성자를 호출
		this.addr = addr;
		this.age = age;
	}
	
	
}
public class InheritanceTest03 {

	public static void main(String[] args) {
		
		

	}

}
