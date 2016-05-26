package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//��Ʈ��ũ ���� ����(�ڿ�)�� ���� �� �ִ� ����� �����ϴ� ��ü
public class URLTest01 {
	public static void main(String[] args) throws IOException {
		try{
			//��Ʈ��ũ �ڿ��� �����ϱ� ���� URL ��ü����
			URL url = new URL(args[0]);
			System.out.println(url.toString());
			System.out.println("url.getHost()=>"+url.getHost());
			System.out.println("url.getPath()=>"+url.getPath());
			//port�� -1�̸� -1port�� �����ߴٴ� �ǹ̰� �ƴ϶� �������ݿ� ��ϵǾ��ִ�
			//�⺻ port�� ���ӵȴٴ� �ǹ� - http���������� �⺻ port�� 80��Ʈ
			System.out.println("url.getPort()=>"+url.getPort());
			System.out.println("url.getProtocol()=>"+url.getProtocol());
			System.out.println("url.getFile()=>"+url.getFile());
			
			//��Ʈ��ũ �ڿ��� Ŭ���̾�Ʈ���� �ϱ� ���ؼ� ��Ʈ���� �޾ƿ�
			BufferedReader data = new BufferedReader(new InputStreamReader(url.openStream()));
			
			while(true){
				String line = data.readLine();
				if(line==null){
					break;
				}
				System.out.println(line);
			}
			

			
		}catch(MalformedURLException e){
			e.printStackTrace();
		}
	}
}
