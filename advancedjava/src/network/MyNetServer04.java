package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

//Ŭ���̾�Ʈ�� ������ input/output�۾��� �Ҽ� �ִ� ����
public class MyNetServer04 {

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
				
				out = new PrintWriter(client.getOutputStream());
				
				//**********��Ž���*****************
				out.println("Ŭ���̾�Ʈ�� ���� ����...");
				out.flush();
				
				String recvMsg = in.readLine();
				System.out.println("Ŭ���̾�Ʈ�κ��� ���۵� ������=>"+recvMsg);

				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
