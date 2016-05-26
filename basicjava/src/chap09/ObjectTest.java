package chap09;

import java.util.Date;
import java.util.Random;

public class ObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1 = new Object();
		System.out.println(obj1);
		Object obj2 = new Object();
		System.out.println(obj2);
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		String str =new String("java");
		System.out.println(str);
		System.out.println(str.toString());
		
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toString());
		
		Random r = new Random();
		System.out.println(r);
		System.out.println(r.toString());
	}

}
