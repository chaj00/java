package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//클라이언트와 간단한 input/output작업을 할수 있는 서버
public class MyNetServer04 {

	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		Socket client = null;
		
		
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("클라이언트의 접속을 기다림");
			while(true){
				client = server.accept();

				System.out.println(
					client.getInetAddress().getHostAddress()+"님이 접속");
				
				in = new BufferedReader(
						new InputStreamReader(client.getInputStream()));
				
				out = new PrintWriter(client.getOutputStream());
				
				//**********통신시작*****************
				out.println("클라이언트님 접속 성공...");
				out.flush();
				
				String recvMsg = in.readLine();
				System.out.println("클라이언트로부터 전송된 데이터=>"+recvMsg);

				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
