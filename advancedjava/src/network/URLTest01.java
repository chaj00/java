package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

//네트워크 상의 파일(자원)을 읽을 수 있는 기능을 지원하는 객체
public class URLTest01 {
	public static void main(String[] args) throws IOException {
		try{
			//네트워크 자원에 접속하기 위해 URL 객체생성
			URL url = new URL(args[0]);
			System.out.println(url.toString());
			System.out.println("url.getHost()=>"+url.getHost());
			System.out.println("url.getPath()=>"+url.getPath());
			//port가 -1이면 -1port에 접속했다는 의미가 아니라 프로토콜에 등록되어있는
			//기본 port로 접속된다는 의미 - http프로토콜의 기본 port는 80포트
			System.out.println("url.getPort()=>"+url.getPort());
			System.out.println("url.getProtocol()=>"+url.getProtocol());
			System.out.println("url.getFile()=>"+url.getFile());
			
			//네트워크 자원을 클라이언트에서 일기 위해서 스트림을 받아옴
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
