package chap06;

import java.io.FileInputStream;

public class APIConstructorTest {

	public static void main(String[] args) throws Exception{
		FileInputStream fi = new FileInputStream("test.txt");

		System.out.print((char)fi.read());
		

	}

}
