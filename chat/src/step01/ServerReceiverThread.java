package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//클라이언트에서 전송되는 데이터를 읽는 일을 처리하는 쓰레드
public class ServerReceiverThread extends Thread{
	Socket client;

	public ServerReceiverThread(Socket client) {
		super();
		this.client = client;
	}
	
	public void run(){
		try {
			BufferedReader in = new BufferedReader(
							new InputStreamReader(
										client.getInputStream()));
			String reMsg = "";
			while(true){
				reMsg = in.readLine();//클라이언트가 입력하는 데이터 읽기
				if(reMsg==null){
					break;
				}
				System.out.println("클라이언트>>"+reMsg);//출력하기
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}







