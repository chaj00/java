package chap07.poly;
class Super{
	String name = "장동건";
	public void display(){
		System.out.println("Super의 display");
	}
}

class Sub extends Super{
	String name = "이민호";
	int data =1000;
	public void display(){
		System.out.println("Sub의 display");
	}
	public void test(){
		System.out.println("test");
	}
}
class Sub2 extends Super{
	
}

public class RefCastingTest01 {
	public static void main(String[] args) {
		System.out.println("Super타입의 참조변수로 Super객체에 접근");
		Super obj1 = new Super();
		System.out.println(obj1.name);
		obj1.display();
		System.out.println();
		
		System.out.println("Sub타입의 참조변수로 Sub객체에 접근");
		Sub obj2 = new Sub();
		System.out.println(obj2.name);
		obj2.display();
		System.out.println();
		//참조형의 자동형변환
		//=> 참조형의 형변환은 상속관계에 있는 클래스끼리만 가능하다.
		//   부모타입 변수 = new 자식객체()는 자동형변환이 이루어진다.
		//   현재 작업 중인 곳에서 기준은 타입이므로 참조변수의 타입에 해당하는 멤버만 접근이 가능하다.
		System.out.println("Super타입의 참조변수로 Sub객체를 접근");
		Super obj3 = new Sub();//obj3이 Super타입이므로 Super의 name이 호출
		System.out.println(obj3.name);
		obj3.display();//단, 오버라이딩된 메소드인 경우에는 오버라이딩된 메소드가 우선으로 인식
		((Sub)obj3).test();//test()는 Sub클래스의 멤버이므로 접근이 불가능하나
						   //obj3이라는 변수가 실제 참조하는 객체가 Sub객체이므로 형변환을 명시적으로 하면 접근이 가능하다.
		System.out.println();
		
		System.out.println("Sub타입의 참조변수로 Super객체를 접근");
		
		

	}

}
