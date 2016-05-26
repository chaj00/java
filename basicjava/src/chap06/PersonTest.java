package chap06;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person("장동건","서울시",45);
		
		//p.setName("장동건");
		//p.setAddr("서울시");
		//p.setAge(40);
		
		System.out.println("성명:"+p.getName()+", 주소:"+p.getAddr()+", 나이:"+p.getAge() );

	}

}
