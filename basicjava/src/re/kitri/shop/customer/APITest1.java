package re.kitri.shop.customer;

import java.util.Date;
import java.util.Random;


public class APITest1
{
	public static void main(String[] args) 
	{
		int i = 100;


		String str = new String("java");
		int size =str.length();
		System.out.println("문자열의 길이=> "+ size);
		Random rand = new Random();
		
		Date d =null;
		int num = rand.nextInt();
		System.out.println("랜덤수=> " + num);

		int num2 = rand.nextInt(48)+1;
		System.out.println("랜덤수=> " + num2);

		char c = str.charAt(3);
		System.out.println("" + c);

	}
}  
