package chap09;

public class WrapperTest {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//5.0이전버전
		Object obj = null;
		int i = 10;
		Integer in = new Integer(i);
		obj = in;
		
		int data = in.intValue();
		
		//5.0이후버전- 컴파일러가 변환을 자동으로 해준다.
		obj =10000; //컴파일러가 자동으로 Wrapper클래스에 해당하는 Integer객체로 변환해서 obj에 할당
		            //Integer객체로 변환해서 obj에 할당
					//Integer in = new Integer(10000) -오토박싱
		            //obj = in;
		
		data = in; //컴파일러가 자동으로 참조형인 Integer클래스 내부에 들어있는 int값을 꺼내서 지정 = 오토언박싱
		           //data = in.intValue();

	}

}
