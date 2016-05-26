package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		FileReader fs = null;
		BufferedReader br =null;
		try{
			//1. 읽고싶은 파일을 오픈 - 스트림클래스를 생성한다.
			fs = new FileReader("src/data/test.txt");
			br = new BufferedReader(fs);
			
			int count =0;
			while(true){
				String data = br.readLine(); //2. 파일엑세스
				if(data==null){ //스트림의 끝이라는 의미
					break;
				}
				System.out.println(data);
				count++;
			}
			System.out.println("파일엑세스==>"+count);
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
