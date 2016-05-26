package chap07.poly;

import chap07.Person;

public class RefCastingTest02 {

	public static void main(String[] args) {
		Sub obj = new Sub();
		Sub2 obj2 = new Sub2();
		Super obj3 = new Sub();
		Super obj4 = new Super();
		Person p = new Person();
		
		if( obj4 instanceof Sub){
			System.out.println("캐스팅가능");
		}else{
			System.out.println("캐스팅불가능");
		}

	}

}
