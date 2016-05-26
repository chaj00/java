package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fs = null;
		try{
			//1. 읽고싶은 파일을 오픈 - 스트림클래스를 생성한다.
			fs = new FileInputStream("src/data/test.txt");
			while(true){
				int data = fs.read(); //2. 파일엑세스
				if(data==-1){ //스트림의 끝이라는 의미
					break;
				}
				System.out.print((char)data);
			}
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
