package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//클라이언트가 전송하는 데이터를
public class EchoServer04 {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("클라이언트의 접속을 기다림");
			while(true){
				socket = server.accept();

				System.out.println(
					socket.getInetAddress().getHostAddress()+"님이 접속");
				
				SendThread st = new SendThread(socket);
				RecvThread rt =new RecvThread(socket);
				
				st.start();
				rt.start();
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
