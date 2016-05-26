package step01;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

//서버와 1:1로 통신
public class SingleChatClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.25.56", 12345);
			new ClientReceiverThread(socket).start();
			new ClientSenderThread(socket).start();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
