package network;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

//Ŭ���̾�Ʈ�� �����ϴ� �����͸�
public class EchoServer04 {
	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("Ŭ���̾�Ʈ�� ������ ��ٸ�");
			while(true){
				socket = server.accept();

				System.out.println(
					socket.getInetAddress().getHostAddress()+"���� ����");
				
				SendThread st = new SendThread(socket);
				RecvThread rt =new RecvThread(socket);
				
				st.start();
				rt.start();
			
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
