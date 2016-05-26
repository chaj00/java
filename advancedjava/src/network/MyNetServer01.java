package network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//서버 - 클라이언트 접속정보를 확인
public class MyNetServer01 {
	public static void main(String[] args){
		//클라이언트와 통신할 수있도록 준비
		//==>클라이언트와 통신을 하기 위해서 ServerSocket객체를 생성
		try {
			ServerSocket server = new ServerSocket(50000);
			System.out.println("서버 준비 완료....클라이언트 접속을 기다림....");
			//클라이언트가 접속할때 까지 대기
			while(true){
				Socket client = server.accept();
				InetAddress ia = client.getInetAddress();
				System.out.println("접속한 클라이언트:"+ia.getHostAddress());
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
