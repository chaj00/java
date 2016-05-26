package IO;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public static void main(String[] args) {
		InputStream in = System.in;
		try{
			while(true){
				int data = in.read();
				System.out.print((char)data);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
