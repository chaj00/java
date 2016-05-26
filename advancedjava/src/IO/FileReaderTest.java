package IO;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		FileReader fs = null;
		try{
			//1. �а���� ������ ���� - ��Ʈ��Ŭ������ �����Ѵ�.
			fs = new FileReader("src/data/test.txt");
			int count =0;
			while(true){
				int data = fs.read(); //2. ���Ͽ�����
				if(data==-1){ //��Ʈ���� ���̶�� �ǹ�
					break;
				}
				System.out.print((char)data);
				count++;
			}
			System.out.println("���Ͽ�����==>"+count);
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
