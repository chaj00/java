package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;

//Ŭ���̾�Ʈ�� �����ϴ� �����͸�
public class EchoServer03 {
	public static void main(String[] args) {
		BufferedReader keyin = null;
		BufferedReader in = null;
		PrintWriter out = null;
		Socket client = null;
		SendThread st = null;
		RecvThread rt =null;
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ�");
			while(true){
				client = server.accept();

				System.out.println(
					client.getInetAddress().getHostAddress()+"���� ����");
				
				/*
				in = new BufferedReader(
						new InputStreamReader(client.getInputStream()));
				
				out = new PrintWriter(client.getOutputStream(),true);
				keyin = new BufferedReader(new InputStreamReader(System.in));
				
				String sendMsg=null;
				String recvMsg=null;

				while(true){
					if((recvMsg=in.readLine())!=null){
						System.out.println("Ŭ���̾�Ʈ : "+recvMsg);
					}
					if((sendMsg = keyin.readLine())!=null){
						out.println(sendMsg);
					}
				}*/
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
