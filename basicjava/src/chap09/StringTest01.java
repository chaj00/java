package chap09;

public class StringTest01 {

	public static void main(String[] args) {
		String str1 = new String("java");
		byte[] data1 = new byte[]{65,66,67,68};
		char[] data2 = {'a','b','c','d'};
		String str2 = new String(data1);
		String str3 = new String(data1,1,2);
		
		
		System.out.println(str1);

	}

}
