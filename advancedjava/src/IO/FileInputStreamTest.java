package IO;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest {

	public static void main(String[] args) {
		FileInputStream fs = null;
		try{
			//1. �а���� ������ ���� - ��Ʈ��Ŭ������ �����Ѵ�.
			fs = new FileInputStream("src/data/test.txt");
			while(true){
				int data = fs.read(); //2. ���Ͽ�����
				if(data==-1){ //��Ʈ���� ���̶�� �ǹ�
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
