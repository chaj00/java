package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//서버로 접속해서 서버와 간단한 input/output하기
public class EchoClient03 {
	public static void main(String[] args) {
		BufferedReader keyin = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Socket socket = null;

		try {
			socket = new Socket("192.168.9.43", 12345);
			
			in = new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(), true);
			keyin = new BufferedReader(new InputStreamReader(System.in));
			
			String sendMsg =null;
			String recvMsg =null;
			
			while(true){
				if((sendMsg=keyin.readLine())!=null){
					out.println(sendMsg);					
				}
				if((recvMsg=in.readLine())!=null){
					System.out.println("서버 : "+recvMsg);
				}
				
			}														
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
