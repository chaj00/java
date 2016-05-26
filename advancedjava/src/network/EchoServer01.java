package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//Ŭ���̾�Ʈ�� �����ϴ� �����͸�
public class EchoServer01 {

	public static void main(String[] args) {
		BufferedReader in = null;
		PrintWriter out = null;
		Socket client = null;
		
		
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ�");
			while(true){
				client = server.accept();

				System.out.println(
					client.getInetAddress().getHostAddress()+"���� ����");
				
				in = new BufferedReader(
						new InputStreamReader(client.getInputStream()));
				
				out = new PrintWriter(client.getOutputStream(),true);
				
				String sendMsg=null;
				String recvMsg=null;
				
				while((recvMsg=in.readLine())!=null){
					System.out.println("Ŭ���̾�Ʈ���� ���۵� ������>>"+recvMsg);
					out.println(recvMsg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
