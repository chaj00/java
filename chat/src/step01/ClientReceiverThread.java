package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

//서버에서 전송되는 데이터를 읽는 일을 처리하는 쓰레드
public class ClientReceiverThread extends Thread{
	Socket server;

	public ClientReceiverThread(Socket server) {
		super();
		this.server = server;
	}
	
	public void run(){
		try {
			BufferedReader in = new BufferedReader(
							new InputStreamReader(
									server.getInputStream()));
			String reMsg = "";
			while(true){
				reMsg = in.readLine();//서버가 입력하는 데이터 읽기
				if(reMsg==null){
					break;
				}
				System.out.println("서버>>"+reMsg);//출력하기
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}







