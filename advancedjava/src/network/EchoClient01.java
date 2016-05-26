package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

//서버로 접속해서 서버와 간단한 input/output하기
public class EchoClient01 {
	public static void main(String[] args) {
		//서버에게 전송할 데이터를 키보드를 입력받을 수 있는 스트림
		BufferedReader keyin = null;
		//서버가 보내오는 데이터를 읽도록 지원하는 스트림
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
			
			String sendMsg ="";//서버에게 보낼 메세지
			String recvMsg = "";//서버에게 받을 메세지
			
			while((sendMsg = keyin.readLine())!=null){
				//키보드로 입력하는 데이터를 서버에 전송
				out.println(sendMsg);
				
				//서버가 보내오는 데이터를 읽어서 출력하기
				
				recvMsg = in.readLine();
				System.out.println("서버에서 전송된 데이터>>"+recvMsg);
			}
																
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
