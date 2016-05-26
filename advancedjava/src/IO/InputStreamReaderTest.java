package IO;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
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
