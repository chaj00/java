package chap09;
//String클래스와 StringBuffer클래스의 비교
//문자열 추가 작업을 String과 StringBuffer로 표현하고 결과를 측정
//-System클래스의 nanoTime()를 이용해서 측정
public class StringStringBufferTest {

	public static void main(String[] args) {
		final int COUNT = 10000;
		System.out.println("실행횟수"+COUNT);
		stringData(COUNT);
		stringBufferData(COUNT);
	}
	public static void stringData(int count){
		//시작할때 현재 시간을 측정
		long start = System.nanoTime();
		String str = "자바";
		for (int i=1; i<=count;i++){
			str = str+"java";
		}
		//작업이 종료될떄 현재 시간 측정
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("str = str+java");
		System.out.println("걸린시간:"+time);
	}
	public static void stringBufferData(int count){
		//시작할때 현재 시간을 측정
		long start = System.nanoTime();
		StringBuffer sb = new StringBuffer("자바");
		for (int i=1; i<=count;i++){
			sb.append("java");
		}
		//작업이 종료될떄 현재 시간 측정
		long end = System.nanoTime();
		long time = end-start;
		System.out.println("str = str+java");
		System.out.println("걸린시간:"+time);
		
	}
	

}
