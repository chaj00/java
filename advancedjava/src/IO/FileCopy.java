package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("src/data/test.txt");
		FileWriter fw = new FileWriter("src/data/result.txt");
		
		while(true){
			int data = fr.read();
			if(data==-1){
				break;
			}
			fw.write(data);
		}
		if(fr!=null)fr.close();
		if(fr!=null)fw.close();
		
		//result.txt파일을 열어 Copy 결과 테스트
		FileReader fr2 = new FileReader("src/data/result.txt");
		while(true){
			int data = fr2.read();
			if(data==-1){
				break;
			}
			System.out.print((char)data);
		}
		fr2.close();
	}
}
