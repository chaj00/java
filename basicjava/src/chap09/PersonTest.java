package chap09;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("장동건","서울", 45);
		Person p1 = new Person("장동건","서울", 45);
		insert(p);
		
		if(p.equals(p1)){
			System.out.println("같다.");
		}else{
			System.out.println("다르다");
		}
		
		p=p1;
		if(p==p1){
			System.out.println("복제전-같다");
		}else{
			System.out.println("복제전-다르다");
		}
		
		p=(Person)p1.clone();
		if(p==p1){
			System.out.println("복제후-같다");
		}else{
			System.out.println("복제후-다르다");
		}
		
		
	}
	
	public static void insert(Person p){
		System.out.println(p);
		
	}

}
