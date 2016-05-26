package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//클라이언트가 전송하는 데이터를
public class EchoServer01 {

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
				
				out = new PrintWriter(client.getOutputStream(),true);
				
				String sendMsg=null;
				String recvMsg=null;
				
				while((recvMsg=in.readLine())!=null){
					System.out.println("클라이언트에서 전송된 데이터>>"+recvMsg);
					out.println(recvMsg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
