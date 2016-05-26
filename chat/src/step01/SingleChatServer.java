package step01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SingleChatServer {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(12345);
			System.out.println("���� �غ� �Ϸ�");
			while(true){
				Socket client = server.accept();
				System.out.println(client.getInetAddress()
						.getHostAddress()+"�� ����");
				new ServerReceiverThread(client).start();
				new ServerSenderThread(client).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
