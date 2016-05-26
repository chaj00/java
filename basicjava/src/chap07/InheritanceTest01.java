package chap07;
//상속관계에서 멤버필드
/*
 * 1. 상속관계에서 상위클래스에 선언된 멤버필드는 하위클래스에서 접근이 가능하다.
 * 2. 상위클래스에서 선언된 변수와 동일한 이름의 멤버필드가 하위클래스에 정의된 경우
 *    부모필드보다 하위클래스에 정의된 멤버필드가 우선으로 인식된다.
 * 3. 부모의 멤버를 접근하고 싶은 경우 super를 이용하여 접근한다.
 *    this => 자기자신의 객체를 지칭
 *    super => 부모객체
 * 4. 단, private 멤버는 하위객체에서도 접근이 불가능
 * 
 *  
 */
class Super{
	int num =10;
	
}
class Sub extends Super{
	int num =100;
	
	public void display(){
		System.out.println("num=>"+num);
		System.out.println("부모의num=>"+super.num);
	}
}

public class InheritanceTest01 {
	public static void main(String[] args) {
		Sub obj = new Sub();
		//System.out.println(obj.num);
		obj.display();

	}

}
