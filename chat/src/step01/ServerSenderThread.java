package step01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSenderThread extends Thread{
	Socket client;

	public ServerSenderThread(Socket client) {
		super();
		this.client = client;
	}
	public void run(){
		BufferedReader keyin =  new BufferedReader(
				 new InputStreamReader(System.in));//Ű�����Է�
		try {
			PrintWriter out = new PrintWriter(
					client.getOutputStream(),true);//Ŭ���̾�Ʈ���� ������
			//Ű����� �Է¹��� �����͸� Ŭ���̾�Ʈ���� ����
			String sendMsg = "";
			while(true){
				sendMsg = keyin.readLine();
				if(sendMsg==null){
					break;
				}
				out.println(sendMsg);
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
	}
}





