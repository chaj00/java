package chap09;

public class PersonTest {

	public static void main(String[] args) {
		Person p = new Person("�嵿��","����", 45);
		Person p1 = new Person("�嵿��","����", 45);
		insert(p);
		
		if(p.equals(p1)){
			System.out.println("����.");
		}else{
			System.out.println("�ٸ���");
		}
		
		p=p1;
		if(p==p1){
			System.out.println("������-����");
		}else{
			System.out.println("������-�ٸ���");
		}
		
		p=(Person)p1.clone();
		if(p==p1){
			System.out.println("������-����");
		}else{
			System.out.println("������-�ٸ���");
		}
		
		
	}
	
	public static void insert(Person p){
		System.out.println(p);
		
	}

}
