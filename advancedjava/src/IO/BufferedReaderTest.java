package IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		FileReader fs = null;
		BufferedReader br =null;
		try{
			//1. �а���� ������ ���� - ��Ʈ��Ŭ������ �����Ѵ�.
			fs = new FileReader("src/data/test.txt");
			br = new BufferedReader(fs);
			
			int count =0;
			while(true){
				String data = br.readLine(); //2. ���Ͽ�����
				if(data==null){ //��Ʈ���� ���̶�� �ǹ�
					break;
				}
				System.out.println(data);
				count++;
			}
			System.out.println("���Ͽ�����==>"+count);
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
