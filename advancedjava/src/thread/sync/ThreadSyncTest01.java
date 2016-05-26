package thread.sync;

public class ThreadSyncTest01 {

	public static void main(String[] args) {
		Toilet obj = new Toilet();
		
		//공유객체를 사용할 쓰레드 객체를 생성
		Person p1 = new Person("장동건",obj);
		Person p2 = new Person("현빈",obj);
		Person p3 = new Person("변영운",obj);
		Person p4 = new Person("박민수",obj);
		Person p5 = new Person("이현우",obj);
		Person p6 = new Person("김재헌",obj);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		
	}

}
