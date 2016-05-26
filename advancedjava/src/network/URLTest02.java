package network;

import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


//��Ʈ��ũ ���� ����(�ڿ�)�� ���� �� �ִ� ����� �����ϴ� ��ü
public class URLTest02 {
	public static void main(String[] args) {
		BufferedInputStream bis;
		FileOutputStream fos=null;
		try{

			String addr = "http://tv01.search.naver.net/ugc?t=r100&q=http://cafefiles.naver.net/"
						+ "20120209_226/pododumok_13287752996753FNE4_jpg/%C0%E5%B5%BF%B0%C7_5_pododumok.jpg";

			URL url = new URL(addr);

			bis = new BufferedInputStream(url.openStream());
			fos = new FileOutputStream("src/images/webimg.jpg");
			while(true){
				int data = bis.read();
				if(data==-1){
					break;
				}
				fos.write(data);
			}
		}catch(MalformedURLException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
