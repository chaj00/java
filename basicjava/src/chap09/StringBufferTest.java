package chap09;
public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java programming");
		System.out.println(sb);
		sb.append("Àç¹Õ´Ù.");
		System.out.println(sb);
		sb.insert(2, "java");
		System.out.println(sb);
		sb.delete(2,5);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
	}
	
}

