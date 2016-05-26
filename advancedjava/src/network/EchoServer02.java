package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;

//클라이언트가 전송하는 데이터를
public class EchoServer02 {

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
				
				out.println("안녕하세요 클라이언트님?");
				while(true){
					recvMsg = in.readLine();
					if(recvMsg==null){
						break;
					}else if(recvMsg.equals("안녕하세요?") |recvMsg.equals("하이")){
						sendMsg = client.getInetAddress().getHostAddress()+"님 반가워요";
					}else if(recvMsg.equals("오늘날짜는")){
						Calendar cal=Calendar.getInstance();
						sendMsg = Integer.toString(cal.get(Calendar.YEAR))+"년"
									+ Integer.toString(cal.get(Calendar.MONTH))+"월"
									+ Integer.toString(cal.get(Calendar.DATE))+"일";  
					}else{
						sendMsg = client.getInetAddress()+"님 어여 가~~";
					}
					
					out.println(sendMsg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
