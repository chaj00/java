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
				 new InputStreamReader(System.in));//Ű�����Է�
		try {
			PrintWriter out = new PrintWriter(
					server.getOutputStream(),true);//Ŭ���̾�Ʈ���� ������
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}





