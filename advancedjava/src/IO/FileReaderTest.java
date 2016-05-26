package IO;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fs = null;
		try{
			//1. 읽고싶은 파일을 오픈 - 스트림클래스를 생성한다.
			fs = new FileReader("src/data/test.txt");
			int count =0;
			while(true){
				int data = fs.read(); //2. 파일엑세스
				if(data==-1){ //스트림의 끝이라는 의미
					break;
				}
				System.out.print((char)data);
				count++;
			}
			System.out.println("파일엑세스==>"+count);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				fs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
