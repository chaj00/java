package chap09;

public class StringTest03 {

	public static void main(String[] args) {
		String str = new String("java programming");
		String str2 = new String("java,servlet,spring,bigdata");
		
		//1. String->byte[]
		byte[] data1 = str.getBytes();
		for (int i = 0; i < data1.length; i++) {
			System.out.println(data1[i]);
		}
		//2. String -> char[]
		char[] data2 = str.toCharArray();
		for (int i= 0; i < data2.length; i++) {
			System.out.println(data2[i]);
		}
		//3. String->String[] : 구분자(, : )
		String[] data3= str2.split(",");
		for (int i = 0; i < data3.length; i++) {
			System.out.println(data3[i]);
		}
		//4. 기본형->String
		int i =10;
		char c ='a';
		String data4 = String.valueOf(i);
		String data5 = String.valueOf(c);
		String data6 = i+"";
		System.out.println(data4);
		System.out.println(data5);
		System.out.println(data6);
		
		

	}

}
