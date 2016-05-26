package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientSenderThread extends Thread{
	Socket server;

	public ClientSenderThread(Socket server) {
		super();
		this.server = server;
	}
	public void run(){
		BufferedReader keyin =  new BufferedReader(
				 new InputStreamReader(System.in));//키보드입력
		try {
			PrintWriter out = new PrintWriter(
					server.getOutputStream(),true);//클라이언트한테 보내기
			//키보드로 입력받은 데이터를 클라이언트에게 전송
			String sendMsg = "";
			while(true){
				sendMsg = keyin.readLine();
				if(sendMsg==null){
					break;
				}
				out.println(sendMsg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}





