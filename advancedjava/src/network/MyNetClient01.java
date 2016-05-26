package network;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyNetClient01 {
	public static void main(String[] args){
		//서버와 통신하기 위한 소켓객체를 생성
		//==> ip와 port를 이용해서 생성, 서버와 접속을 못하면 Exception을 발생시킨다.
		try {
			Socket socket = new Socket("192.168.9.29", 50000);
			System.out.println("서버와 접속완료..."+socket);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
