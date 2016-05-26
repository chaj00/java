package chap09;

public class StringTest02 {

	public static void main(String[] args) {
		String str1 = new String("java programming");
		String str2 = new String("Àç¹Õ´Ù.");
		
		System.out.println("str1.charAt(1)=>"+str1.charAt(1));
		System.out.println("str1.concat(str2)=>"+str1.concat(str2));
		System.out.println("str1.indexOf(a)=>"+str1.indexOf("a"));
		System.out.println("str1.lastIndexOf(a)=>"+str1.lastIndexOf("a"));
		System.out.println("str1.indexOf(ÇÕ)=>"+str1.indexOf("ÇÕ"));
		System.out.println("str1.equals(java programming)=>"+str1.equals("Java programming"));
		System.out.println("str1.equalsIgnoreCase(java programming)=>"+str1.equalsIgnoreCase("Java programming"));
		System.out.println("str1.length()=>"+str1.length());
		System.out.println("str1.replace('a','A')=>"+str1.replace('a','A'));
		System.out.println("str1.substring(3)=>"+str1.substring(3));
		System.out.println("str1.substring(0,3)=>"+str1.substring(0,3));
		System.out.println("str1.toUpperCase()"+str1.toUpperCase());
		System.out.println("str1.toLowerCase()"+str1.toLowerCase());
		
		//exam
		String data = new String("java");
		for (int i = 0; i < data.length(); i++) {
			System.out.println(data.charAt(i));			
		}
		
	}

}
