package IO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("src/data/out.txt", true);
		fw.write("�ȳ�~~~~\n");
		
		fw.close();
	}

}
